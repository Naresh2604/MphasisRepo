package Files.com.FilesDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoOnByteStream {

    public static void main(String[] args) throws IOException {
        // Step 1: Read file
//        BufferedReader reader = new BufferedReader(new FileReader("assests/data.txt"));
//        String data;
//        while ((data = reader.readLine()) != null) {
//            System.out.println(data);
//        }
//        reader.close(); // must close manually since no try-with-resources
//
//        // Step 2: Write file (append mode)
//        BufferedWriter writer = new BufferedWriter(new FileWriter("assests/data.txt", true));
//        writer.write("\nthis is modification with buffered writer");
//        writer.close(); // close manually
//    	Bottle b=new Bottle(1,"cello",700,"blue");
//    	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("assests/bottleInfo.txt"));
//    	oos.writeObject(b);
//    	oos.close();
//    	
        Bottle b = new Bottle(1, "cello", 700, "blue");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("assests/bottleInfo.txt"));
        oos.writeObject(b);
        oos.close();
    	System.out.println(b);
    	
        
        
    }
}
