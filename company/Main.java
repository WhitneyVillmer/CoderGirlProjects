package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int menuChoice;
    static Boolean runMenu;


    public static void menu() {


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

        ArrayList<Users> newUser = new ArrayList<>();
        ArrayList<Post> newPost = new ArrayList<>();

        Users currentUser = null;
        String post;
        int postOrder = 0;

        while (runMenu = true) {
            if(currentUser != null)
            {
                System.out.println("You are currently " + currentUser.getUserName());
            }
            menu();
            switch (menuChoice) {
                case 1:
                    System.out.println("What is the URL for your avatar? ");
                    String avatarLink = keyboard.nextLine();
                    System.out.println("What would you like your user name to be? ");
                    String userName = keyboard.nextLine();
                    System.out.println("What are your first and last name? ");
                    String authorName = keyboard.nextLine();
                    System.out.println("What is your email address? ");
                    String email = keyboard.nextLine();
                    Users create = new Users(avatarLink, userName, authorName, email);
                    newUser.add(create);

                    break;
                case 2:
                    if (newUser.isEmpty()) {
                        System.out.println("There are no users to select from yet! Returning to main menu... ");
                    } else {
                        for(int i = 0; i < newUser.size(); i++)
                        {
                            System.out.println(i + 1 + ". " + newUser.get(i).getUserName());
                        }
                        System.out.println("Please select the number of the user you want to become.");
                        currentUser = newUser.get(keyboard.nextInt()-1);
                    }
                    break;
                case 3:
                    keyboard.nextLine();
                    if(newPost.size() > 0) {
                        String lastPost = "This is the first post.";
                        for(int i = 0; i < newPost.size(); i++) {
                            if (newPost.get(i).getUserName().equals(currentUser.getUserName())){
                                lastPost = newPost.get(i).getContent();
                            }
                        }
                        System.out.println(lastPost);
                    }
                    System.out.println("Please enter the content of your post. ");
                    post = keyboard.nextLine();
                    newPost.add(new Post(currentUser.getUserName(), postOrder, post));
                    postOrder++;
                    break;
                case 4:
                    for(int i = 0; i < newPost.size(); i++)
                    {
                        System.out.println(i + 1 + ". " + newPost.get(i)); //Multiplication Table //Method?
                    }
                    break;
                case 5:
                    for(int i = 0; i < newUser.size(); i++)
                    {
                        System.out.println(i + 1 + ". " + newUser.get(i).getUserName());
                    }
                    break;
                default:
                    System.out.println("You must select an option, 1-5.");

            }
        }
    }
}
