package Day10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("Hi.txt");
            if (file.createNewFile()) {
                System.out.println("file created ...: ");
            } else {
                System.out.println("File already exists." + file.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // file writing
        try {
            FileWriter writer = new FileWriter("Hi.txt");
            writer.write("Hello, this is Java file handling!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // // file reader
        try{
            FileReader fr = new FileReader("Hi.java");
            System.out.println((char) fr.read());
            System.out.println((char) fr.read());
            int ch;
            while ((ch = fr.read()) != -1) { // eof
                System.out.print((char) ch); // (datatype) value
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // nio package
        try {
            Path path = Paths.get("Hi.txt");
            System.out.println("File Name: " + path.getFileName());
            InputStream input = Files.newInputStream(path);
            int ch;
            while ((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}