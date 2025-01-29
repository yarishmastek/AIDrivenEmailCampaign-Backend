package com.yarish.aihackathon;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
//
//@Service
//public class EmailCustomizeService {
//
//    @Value("${openai.api.key}")
//    private String openAiApiKey;
//
//    public String customizeEmail(String emailContent, String prompt) {
//        try {
//            OkHttpClient client = new OkHttpClient();
//
//            // Create OpenAI Request JSON
//            String jsonPayload = "{"
//                    + "\"model\": \"text-davinci-003\","
//                    + "\"prompt\": \"Customize this email: '"
//                    + emailContent + "' for this scenario: '"
//                    + prompt + "'\","
//                    + "\"temperature\": 0.7,"
//                    + "\"max_tokens\": 100"
//                    + "}";
//
//            RequestBody body = RequestBody.create(
//                    jsonPayload,
//                    MediaType.get("application/json; charset=utf-8"));
//
//            // Send POST Request to OpenAI
//            Request request = new Request.Builder()
//                    .url("https://api.openai.com/v1/completions")
//                    .post(body)
//                    .addHeader("Authorization", "Bearer " + openAiApiKey)
//                    .build();
//
//            Response response = client.newCall(request).execute();
//
//            if (response.isSuccessful() && response.body() != null) {
//                String responseBody = response.body().string();
//                // Extract the text response
//                return extractResponseContent(responseBody);
//            } else {
//                throw new RuntimeException("Failed to fetch response from OpenAI: " + response.message());
//            }
//
//        } catch (Exception e) {
//            throw new RuntimeException("Error while communicating with OpenAI API", e);
//        }
//    }
//
//    private String extractResponseContent(String responseBody) {
//        // Extract 'choices[0].text' from the JSON response
//        // Use a JSON library like Jackson or Gson
//        // Assume the response structure is:
//        // {
//        //   "choices": [
//        //     { "text": "Customized email content" }
//        //   ]
//        // }
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            JsonNode root = mapper.readTree(responseBody);
//            System.out.println(root.asText());
//            return root.path("choices").get(0).path("text").asText().trim();
//        } catch (Exception e) {
//            throw new RuntimeException("Error parsing OpenAI response JSON", e);
//        }
//    }
//}

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import okhttp3.*;
//        import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;

//@Service
//public class EmailCustomizeService {
//
//    @Value("${openai.api.key}")
//    private String openAiApiKey;
//
//    public String customizeEmail(String emailContent, String prompt) {
//        try {
//            OkHttpClient client = new OkHttpClient();
//
//            // Create OpenAI Request JSON
//            String jsonPayload = "{"
//                    + "\"model\": \"text-davinci-003\","
//                    + "\"prompt\": \"Customize this email: '"
//                    + emailContent + "' for this scenario: '"
//                    + prompt + "'\","
//                    + "\"temperature\": 0.7,"
//                    + "\"max_tokens\": 100"
//                    + "}";
//
//            RequestBody body = RequestBody.create(
//                    jsonPayload,
//                    MediaType.get("application/json; charset=utf-8"));
//
//            // Send POST Request to OpenAI
//            Request request = new Request.Builder()
//                    .url("https://api.openai.com/v1/completions")
//                    .post(body)
//                    .addHeader("Authorization", "Bearer " + openAiApiKey)
//                    .build();
//
//            Response response = client.newCall(request).execute();
//
//            if (response.isSuccessful() && response.body() != null) {
//                String responseBody = response.body().string();
//                // Extract the text response
//                return extractResponseContent(responseBody);
//            } else {
//                String errorMessage = "Failed to fetch response from OpenAI: " + response.message();
//                if (response.body() != null) {
//                    errorMessage += " - " + response.body().string();
//                }
//                throw new RuntimeException(errorMessage);
//            }
//
//        } catch (Exception e) {
//            throw new RuntimeException("Error while communicating with OpenAI API", e);
//        }
//    }
//
//    private String extractResponseContent(String responseBody) {
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            JsonNode root = mapper.readTree(responseBody);
//            return root.path("choices").get(0).path("text").asText().trim();
//        } catch (Exception e) {
//            throw new RuntimeException("Error parsing OpenAI response JSON", e);
//        }
//    }
//}



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Service
//public class EmailCustomizeService {
//
//    @Value("${openai.api.key}")
//    private String openAiApiKey;
//
//    public String customizeEmail(String emailContent, String prompt) {
//        try {
//            OkHttpClient client = new OkHttpClient();
//
//            // Create OpenAI Request JSON
//            String jsonPayload = "{"
//                    + "\"model\": \"gpt-4\","
//                    + "\"prompt\": \"Customize this email: '"
//                    + emailContent + "' for this scenario: '"
//                    + prompt + "'\","
//                    + "\"temperature\": 0.7,"
//                    + "\"max_tokens\": 100"
//                    + "}";
//
//            RequestBody body = RequestBody.create(
//                    jsonPayload,
//                    MediaType.get("application/json; charset=utf-8"));
//
//            // Send POST Request to OpenAI
//            Request request = new Request.Builder()
//                    .url("https://api.openai.com/v1/completions")
//                    .post(body)
//                    .addHeader("Authorization", "Bearer " + openAiApiKey)
//                    .build();
//
//            Response response = client.newCall(request).execute();
//
//            if (response.isSuccessful() && response.body() != null) {
//                String responseBody = response.body().string();
//                // Extract the text response
//                return extractResponseContent(responseBody);
//            } else {
//                String errorMessage = "Failed to fetch response from OpenAI: " + response.message();
//                if (response.body() != null) {
//                    errorMessage += " - " + response.body().string();
//                }
//                throw new RuntimeException(errorMessage);
//            }
//
//        } catch (Exception e) {
//            throw new RuntimeException("Error while communicating with OpenAI API", e);
//        }
//    }
//
//    private String extractResponseContent(String responseBody) {
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            JsonNode root = mapper.readTree(responseBody);
//            return root.path("choices").get(0).path("text").asText().trim();
//        } catch (Exception e) {
//            throw new RuntimeException("Error parsing OpenAI response JSON", e);
//        }
//    }
//}


//package com.yarish.aihackathon;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailCustomizeService {

    @Value("${openai.api.key}")
    private String openAiApiKey;

    public String customizeEmail(String emailContent, String prompt) {
        try {
            OkHttpClient client = new OkHttpClient();

            // Create OpenAI Request JSON
            String jsonPayload = "{"
                    + "\"model\": \"gpt-4\","
                    + "\"messages\": [{\"role\": \"user\", \"content\": \"Customize this email: '"
                    + emailContent + "' for this scenario: '"
                    + prompt + "'\"}],"
                    + "\"temperature\": 0.7,"
                    + "\"max_tokens\": 100"
                    + "}";

            RequestBody body = RequestBody.create(
                    jsonPayload,
                    MediaType.get("application/json; charset=utf-8"));

            // Send POST Request to OpenAI
            Request request = new Request.Builder()
                    .url("https://api.openai.com/v1/chat/completions")
                    .post(body)
                    .addHeader("Authorization", "Bearer " + openAiApiKey)
                    .build();

            Response response = client.newCall(request).execute();

            if (response.isSuccessful() && response.body() != null) {
                String responseBody = response.body().string();
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
