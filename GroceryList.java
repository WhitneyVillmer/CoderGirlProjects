package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstItem;
        System.out.println("What is the first item on your grocery list? ");
        firstItem = keyboard.nextLine();
        String secondItem;
        System.out.println("What is the second item on your grocery list? ");
        secondItem = keyboard.nextLine();
        String thirdItem;
        System.out.println("What is the third item on your grocery list? ");
        thirdItem = keyboard.nextLine();
        int firstQuantity;
        System.out.println("How many " + firstItem + " do you need? ");
        firstQuantity = keyboard.nextInt(); //forces a response to the above question before moving on
        keyboard.skip("\n");
        int secondQuantity;
        System.out.println("How many " + secondItem + " do you need? ");
        secondQuantity = keyboard.nextInt();
        keyboard.skip("\n");
        int thirdQuantity;
        System.out.println("How many " +thirdItem + " do you need? ");
        thirdQuantity = keyboard.nextInt();
        keyboard.skip("\n");

        float firstPrice;
        System.out.println("What is the cost of " + firstItem + "?");
        firstPrice = keyboard.nextFloat();
        keyboard.skip("\n");

        float secondPrice;
        System.out.println("What is the cost of " + secondItem + "?");
        secondPrice = keyboard.nextFloat();
        keyboard.skip("\n");

        float thirdPrice;
        System.out.println("What is the cost of " + thirdItem + "?");
        thirdPrice = keyboard.nextFloat();
        keyboard.skip("\n");

        System.out.println("Your total bill is...");
        float total = (firstQuantity*firstPrice) + (secondQuantity*secondPrice) + (thirdQuantity*thirdPrice);
        System.out.println("Your total is " + total);




    }
}
