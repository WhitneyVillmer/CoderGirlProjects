package com.company;
import java.util.Scanner;

public class Posts {
    String archives[] = new String[8];
    static int count = 0;
    public void Posts() {}

    public static void newPosts(){
        Scanner keyboard = new Scanner(System.in);
        int postCount = count++;
        String content = "";
        String webAddress = "";;
        System.out.println("Your post number is " + postCount);
        System.out.println("What is on your mind? " + content);
        content = keyboard.nextLine();
        System.out.println("OPTIONAL-Would you like to include a web address? " + webAddress);
        webAddress = keyboard.nextLine();
    }
}
