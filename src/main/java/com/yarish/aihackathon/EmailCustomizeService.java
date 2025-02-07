package com.yarish.aihackathon;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class EmailCustomizeService {

    @Value("${openai.api.key}")
    private String openAiApiKey;

    public String customizeEmail(String emailContent, String prompt) {
        try {

            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .build();

            // Create OpenAI Request JSON
            ObjectMapper objectMapper = new ObjectMapper();
            ObjectNode requestBody = objectMapper.createObjectNode();
//            requestBody.put("model", "gpt-4");
            requestBody.put("model", "deepseek-coder-v2-lite-instruct-mlx");
            ArrayNode messagesArray = requestBody.putArray("messages");
            ObjectNode messageObject = objectMapper.createObjectNode();
            messageObject.put("role", "user");
            messageObject.put("content", "Customize this email: '" + emailContent + "' for this scenario: '" + prompt + "'");
            messagesArray.add(messageObject);
            requestBody.put("temperature", 0.7);
            requestBody.put("max_tokens", 1000);

            RequestBody body = RequestBody.create(
                    objectMapper.writeValueAsString(requestBody),
                    MediaType.get("application/json; charset=utf-8"));

            // Send POST Request to OpenAI
            Request request = new Request.Builder()
//                    .url("https://api.openai.com/v1/chat/completions")
                    .url("http://localhost:6000/v1/chat/completions") // DeepSeek V2 local model
                    .post(body)
                    .addHeader("Authorization", "Bearer " + openAiApiKey)
                    .build();

            Response response = client.newCall(request).execute();

            if (response.isSuccessful() && response.body() != null) {
                String responseBody = response.body().string();
                System.out.println("Response from OpenAI: " + responseBody);
                // Extract the text response
                return extractResponseContent(responseBody);
            } else {
                String errorMessage = "Failed to fetch response from OpenAI: " + response.message();
                if (response.body() != null) {
                    errorMessage += " - " + response.body().string();
                }
                throw new RuntimeException(errorMessage);
            }

        } catch (Exception e) {
            throw new RuntimeException("Error while communicating with OpenAI API", e);
        }
    }

    private String extractResponseContent(String responseBody) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(responseBody);
            return root.path("choices").get(0).path("message").path("content").asText().trim();
        } catch (Exception e) {
            throw new RuntimeException("Error parsing OpenAI response JSON", e);
        }
    }
}