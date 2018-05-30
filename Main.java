package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int menuChoice;

    public static void mainMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("Main Menu");
        System.out.println("1) Create a New User");
        System.out.println("2) Become an Existing User");
        System.out.println("3) Create a Post as the Current User");
        System.out.println("4) Print All Posts");
        System.out.println("5) Print All Users");
        System.out.println("Please select a number: ");
        menuChoice = input.nextInt();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int instanceCounter = 0;
            instanceCounter++;
            int numUsers = instanceCounter;
            String userSelection = "";

            String[] users = new String[10];
            String[] posts = new String[10];


        mainMenu();
        switch(menuChoice) {
            case 1:
                Users.createUser();
                mainMenu();
                break;
            case 2:
                System.out.println("Here is a list of current users: ");
                System.out.println(Arrays.toString(users));
                System.out.println("Under which user name would you like to create posts? ");
                userSelection = input.nextLine();
                mainMenu();
            case 3:
                System.out.println("You are now posting as " + userSelection);
                Posts.newPosts();
                mainMenu();
                break;
            case 4:
                System.out.println(Arrays.toString(posts));
                mainMenu();
                break;
            case 5:
                System.out.println(Arrays.toString(users));
                mainMenu();
                break;
            default:
                break;
        }
    }
}
