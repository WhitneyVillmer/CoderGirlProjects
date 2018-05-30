package com.company;
import java.util.Scanner;

public class Users {

    public Users(){}
    public static void createUser(){
        Scanner keyboard = new Scanner(System.in);
        String userName = "";
        String avatarAddress = "";
        String author = "";
        String email = "";
        //Populate a new array with userName
        System.out.println("What would you like your user name to be? " + userName);
        userName = keyboard.nextLine();
        System.out.println("What is your avatar's URL? " + avatarAddress);
        avatarAddress = keyboard.nextLine();
        System.out.println("What are your first and last name? " + author);
        author = keyboard.nextLine();
        System.out.println("What is your email address? " + email);
        email = keyboard.nextLine();
    }

}
