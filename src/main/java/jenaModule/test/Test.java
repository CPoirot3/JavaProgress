package jenaModule.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

/**
 * Created by hui.chen on 12/9/16.
 */
public class Test {

    public static void deal(File file) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                deal(f);
            }
        }

        if (!file.getAbsolutePath().endsWith(".java")) {
            return;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            File temp = new File("temp");
            if (!temp.exists()) {
                temp.createNewFile();
            }
            PrintStream ps = new PrintStream(new FileOutputStream(temp));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                ps.println(line.replace("org.apache.jena.ext.", ""));
            }
            file.delete();
            temp.renameTo(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
