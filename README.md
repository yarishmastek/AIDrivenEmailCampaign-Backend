### Installation Instructions for Developers

#### Prerequisites
- Java Development Kit (JDK) 17 or higher
- Apache Maven 3.6.3 or higher
- IntelliJ IDEA (or any preferred IDE)
- A Google account with 2FA enabled and an application-specific password for Gmail

#### Steps

1. **Clone the Repository**
   ```sh
   git clone https://github.com/yarishmastek/aihackathon.git
   cd aihackathon
   ```

2. **Set Up Environment Variables**
   Ensure you have the following environment variables set up:
    - `OPENAI_API_KEY`: Your OpenAI API key
    - `SPRING_MAIL_USERNAME`: Your Gmail address
    - `SPRING_MAIL_PASSWORD`: Your application-specific password for Gmail

3. **Configure Application Properties**
   Update the `application.properties` file with your credentials:
   ```ini
   spring.application.name=aihackathon
   server.port=8080
   openai.api.key=your-openai-api-key

   spring.mail.host=smtp.gmail.com
   spring.mail.port=587
   spring.mail.username=your-email@gmail.com
   spring.mail.password=your-app-password
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true
   ```

4. **Build the Project**
   ```sh
   mvn clean install
   ```

5. **Run the Application**
   ```sh
   mvn spring-boot:run
   ```

6. **Access the Application**
   Open your browser and navigate to `http://localhost:8080`.

#### Additional Notes
- Ensure your Google account has 2FA enabled and you have generated an application-specific password for Gmail.
- If you encounter any issues, check the logs for detailed error messages and troubleshoot accordingly.