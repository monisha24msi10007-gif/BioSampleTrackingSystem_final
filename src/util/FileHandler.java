package util;

import java.io.FileWriter;

public class FileHandler {

    public static void writeToFile(String data) {
        try {
            FileWriter fw = new FileWriter("records.txt", true);
            fw.write(data + "\n");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}