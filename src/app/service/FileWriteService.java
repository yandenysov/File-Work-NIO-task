package app.service;

import app.utils.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteService {
   public String writeToFile(String fileName, String fileContent) {
        String stringFilePath = Constants.BASE_PATH + fileName + ".txt";
        Path filePath = Path.of(stringFilePath);
        try {
            Files.writeString(filePath, fileContent);
        } catch (IOException e) {
            return "Exception: " + e.getMessage();
        }
        return "Recorded in: " + filePath;
   }
}