package DEA.problem3;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;

public class DynamicContentFile {
    public void save(Article article, String fileName)
    {
        try (
            FileWriter fw = new FileWriter(fileName)) {
            fw.write(article.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void load(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
    }
    public void load(URL url) {}
}
