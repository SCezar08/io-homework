package ro.scoalainformala;

import java.net.MalformedURLException;
import java.util.Scanner;

public class UrlProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the URL: ");
        String input = sc.nextLine();

        try {
            UrlMethod.processUrl(input);
        } catch (MalformedURLException e) {
            System.out.println("The URL is not correct");
        }
    }
}
