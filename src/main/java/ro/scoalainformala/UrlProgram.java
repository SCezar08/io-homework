package ro.scoalainformala;

import java.io.*;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.Scanner;

public class UrlProgram {

    private static final String OUTPUT_TEXT_FILE_PATH = "E:\\Curs Java\\Teme\\Noiembrie\\url.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the URL: ");
        String input = sc.nextLine();

        URL url1;
        try {
            url1 = new URL(input);

            try (
                    BufferedReader br = new BufferedReader(new InputStreamReader(url1.openStream()));
                    BufferedWriter bw=new BufferedWriter(new FileWriter(OUTPUT_TEXT_FILE_PATH))

            ){
                String lineOfText = null;
                //int count = 0;
                while ((lineOfText = br.readLine()) != null) {
                    String[] words = lineOfText.split("\\s+");
                     int count = words.length;
                    bw.write(count + " " + lineOfText);
                    bw.newLine();
                }
            } catch(IOException e1){
                System.out.println("An error occured while reading or writing: " + e1.getMessage());
            }
        } catch (MalformedURLException e) {
            System.out.println("The url is not correct.");
        }
    }
}





        /* try {
            URL url1 = new URL("https://gist.githubusercontent.com/phillipj/4944029/raw/75ba2243dd5ec2875f629bf5d79f6c1e4b5a8b46/alice_in_wonderland.txt");
            System.out.println(url1);
        } catch (MalformedURLException e) {

        }

         */

