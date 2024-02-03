package app.service;

import app.utils.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadService {
    public String readFromFile(String fileName) {
        String stringFilePath = Constants.BASE_PATH + fileName + ".txt";
        try {
            return Files.readString(Path.of(stringFilePath));
        } catch (IOException e) {
            return "Exception: " + e.getMessage();
        }
    }
}