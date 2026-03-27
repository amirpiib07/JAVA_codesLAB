package LAB_8;

import java.io.*;

public class Q6_ReplaceInFile {
    public static void main(String[] args) {
        String fileName = "sdj.txt";

        // --- Step 1: Create file if it does not exist ---
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File not found. Creating '" + fileName + "' with sample content...");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write("He gave his book to his friend.\n");
                bw.write("This is his pen.\n");
                bw.write("The history of his life is interesting.\n");
                bw.write("She returned his notes yesterday.\n");
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
                return;
            }
            System.out.println("File created successfully.\n");
        }

        // --- Step 2: Read the file ---
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("--- Original Content ---");
        System.out.println(content.toString());

        // --- Step 3: Replace "his" with "her" (word boundaries so "this"/"history" are safe) ---
        String modified = content.toString().replaceAll("\\bhis\\b", "her");

        System.out.println("--- Modified Content ---");
        System.out.println(modified);

        // --- Step 4: Write modified content back to file ---
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(modified);
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}