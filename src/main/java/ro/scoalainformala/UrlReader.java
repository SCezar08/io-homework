package ro.scoalainformala;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlReader {
    private static final File OUTPUT_TEXT_FILE_PATH = new File("/io-url/url.txt");

    public static void processUrl(String input) throws MalformedURLException {
        URL url1 = new URL(input);

        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(url1.openStream()));
                BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_TEXT_FILE_PATH))

        ) {
            String lineOfText = null;
            while ((lineOfText = br.readLine()) != null) {
                String[] words = lineOfText.split("\\s+");
                int count = words.length;
                bw.write(count + " " + lineOfText);
                bw.newLine();
            }
        } catch (IOException e1) {
            System.out.println("An error occured while reading or writing: " + e1.getMessage());
        }
    }

    public static void printPath() {
        System.out.println("The path is: " + OUTPUT_TEXT_FILE_PATH.getAbsolutePath());
    }
}
