package Files.com.FilesDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayExample {
    public static void main(String[] args) throws IOException {
        // Step 1: Open input stream for source file
        FileInputStream fis = new FileInputStream("assests/demo.txt");

        // Step 2: Open output stream for destination file
        FileOutputStream fos = new FileOutputStream("assests/data.txt");

        // Step 3: Create a byte array buffer
        byte[] buffer = new byte[1024]; // 1 KB chunks
        int bytesRead;

        // Step 4: Read into buffer and write out
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        // Step 5: Close streams
        fis.close();
        fos.close();

        System.out.println("File copied successfully using byte array!");
    }
}

