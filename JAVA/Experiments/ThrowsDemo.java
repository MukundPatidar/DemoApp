package Experiments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Test Case 1:");
            readFile("sample.txt");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        try {
            System.out.println("\nTest Case 2:");
            readFile("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}