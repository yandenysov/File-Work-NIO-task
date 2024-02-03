package app;

import app.service.FileWriteService;
import app.service.FileReadService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {getOutput(processFileWorkRequest(getOption()));
    }

    private static int getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose an option:
                1 - create a new .txt file or re-write an existing one.
                2 - read .txt file content.
                """);
        return scanner.nextInt();
    }

    private static String processFileWorkRequest(int option) {
        String result;
        switch (option) {
            case 1 -> result = writeToFile();
            case 2 -> result = readFromFile();
            default -> result = "Error when processing your request.";
        }
        return result;
    }

    private static String writeToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the filename without format (e.g. 'myFile')");
        String fileName = scanner.nextLine();
        System.out.println("Enter the text  which you would like to input into your file");
        String text = scanner.nextLine();
        return new FileWriteService().writeToFile(fileName, text);
    }

    private static String readFromFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the filename without format (e.g. 'myFile')");
        String fileName = scanner.nextLine();
        return new FileReadService().readFromFile(fileName);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}

