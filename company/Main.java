package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static int postOrder;
    static int menuChoice;
    static String selection;
    static Boolean runMenu;


        public static void menu () {
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
        Scanner keyboard = new Scanner(System.in);


        ArrayList<String> newUser = new ArrayList<>();
        ArrayList<String> newPost = new ArrayList<>();

        int instanceCounter = 0;
        instanceCounter++;
        int numUsers = instanceCounter;

        while(runMenu = true){

        menu();
            switch (menuChoice) {
                case 1:
                    Users create = new Users();
                    String avatarLink = create.getAvatarLink();
                    System.out.println("What is the URL for your avatar? " + avatarLink);
                    avatarLink = keyboard.nextLine();
                    String userName = create.getUserName();
                    System.out.println("What would you like your user name to be ? " + userName);
                    userName = keyboard.nextLine();
                    newUser.add(userName);
                    String authorName = create.getAuthorName();
                    System.out.println("What 2are your first and last name? " + authorName);
                    authorName = keyboard.nextLine();
                    String email = create.getEmail();
                    System.out.println("What is your email address? " + email);
                    email = keyboard.nextLine();
                    break;
                case 2:
                    System.out.println("Under which of the following user name would you like to create posts? (Note: Case Sensitive) " + selection);
                    System.out.println(newUser);
                    selection = keyboard.nextLine();
                    System.out.println("You are now posting as " + selection);
                    break;
                case 3:
                    for (int i = 0; i < newPost.size(); i++) {
                        System.out.println(newPost.get(newPost.size() - 1));
                        postOrder = newPost.size() - 1;
                    }
                    System.out.println("User Name: " + selection);
                    newPost.add(selection);
                    Post createNewPost = new Post();
                    String content = createNewPost.getContent();
                    System.out.println("What's on your mind? " + content);
                    content = keyboard.nextLine();
                    newPost.add(content);
                    String webAddress = createNewPost.getWebAddress();
                    System.out.println("OPTIONAL: What is your web address? " + webAddress);
                    webAddress = keyboard.nextLine();
                    newPost.add(webAddress);
                    break;
                case 4:
                    System.out.println(newPost);
                    break;
                case 5:
                    System.out.println(newUser);
                    break;
                default:
                    System.out.println("You must select an option, 1-5.");
                    break;
            }
            }
    }
}