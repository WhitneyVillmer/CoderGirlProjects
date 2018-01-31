package com.company;

import java.util.Scanner;
public class SandwichShop {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;


        System.out.println("The sales goal for veggie sandwiches is 50.");
        System.out.println("How many veggie sandwiches were sold today? ");
        int veggieSandwichesSold = keyboard.nextInt();
        if (veggieSandwichesSold >= goalForVeggies) {
            System.out.println("Met goal!");
        } else {
            System.out.println("Fell short");
        }
        keyboard.skip("\n");

        System.out.println("The sales goal for burgers is 250.");
        System.out.println("How many burgers were sold today? ");
        int burgersSold = keyboard.nextInt();
        if (burgersSold >= goalForBurgers) {
            System.out.println("Met goal!");
        } else {
            System.out.println("Fell short");
        }
        keyboard.skip("\n");

        System.out.println("The sales goal for subs is 180.");
        System.out.println("How many subs were sold today? ");
        int subsSold = keyboard.nextInt();
        if (subsSold >= goalForSubs) {
            System.out.println("Met goal!");
        } else {
            System.out.println("fell short");
        }
        keyboard.skip("\n");

        System.out.println("The sales goal for soups is 70.");
        System.out.println("How many soups were sold today? ");
        int soupSold = keyboard.nextInt();
        if (soupSold >= goalForSoup) {
            System.out.println("Met goal!");
        } else {
            System.out.println("Fell short");
        }
        keyboard.skip("\n");

        int total = (veggieSandwichesSold + burgersSold + subsSold + soupSold);
        int goal = (goalForVeggies + goalForBurgers + goalForSubs + goalForSoup);

        if (total >= goal) {
            System.out.println("Made goal for everything!");

        } else {
            System.out.println("Goal for everything was not met");
        }
    }

}