package com.company;
import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoups = 70;

        System.out.println("The sales goal for veggie sandwiches is 50.");
        System.out.println("How many veggie sandwiches were sold today? ");
        int veggieSandwichesSold = keyboard.nextInt();
        int closeToVeggiesGoal = 40;
        if (veggieSandwichesSold >= closeToVeggiesGoal
                && veggieSandwichesSold < goalForVeggies) {

            System.out.println("Close but did not reach the goal.");
        }
            else if (veggieSandwichesSold <= closeToVeggiesGoal) {
            System.out.println("You did not meet today's goal.");
        }
        else if (veggieSandwichesSold >= goalForVeggies) {
            System.out.println("You met today's goal!");
        }

        System.out.println("The sales goal for burgers is 250.");
        System.out.println("How many burgers were sold today? ");
        int burgersSold = keyboard.nextInt();
        int closeToBurgersGoal = 200;
        if (burgersSold >= closeToBurgersGoal
                && burgersSold < goalForBurgers) {

            System.out.println("Close but did not reach the goal.");
        }
        else if (burgersSold <= closeToBurgersGoal) {
            System.out.println("You did not meet today's goal.");
        }
        else if (burgersSold >= goalForBurgers) {
            System.out.println("You met today's goal!");
        }

        System.out.println("The sales goal for sub sandwiches is 180.");
        System.out.println("How many sub sandwiches were sold today? ");
        int subSandwichesSold = keyboard.nextInt();
        int closeToSubGoal = 144;
        if (subSandwichesSold >= closeToSubGoal
                && subSandwichesSold < goalForSubs) {

            System.out.println("Close but did not reach the goal.");
        }
        else if (subSandwichesSold <= closeToSubGoal) {
            System.out.println("You did not meet today's goal.");
        }
        else if (subSandwichesSold >= goalForSubs) {
            System.out.println("You met today's goal!");
        }

        System.out.println("The sales goal for soups is 70.");
        System.out.println("How many soups were sold today? ");
        int soupSold = keyboard.nextInt();
        int closeToSoupGoal = 56;
        if (soupSold >= closeToSoupGoal
                && soupSold < goalForSoups) {

            System.out.println("Close but did not reach the goal.");
        }
        else if (soupSold <= closeToSoupGoal) {
            System.out.println("You did not meet today's goal.");
        }
        else if (soupSold >= goalForSoups) {
            System.out.println("You met today's goal!");
        }


        if (veggieSandwichesSold >= goalForVeggies &&
                burgersSold >= goalForBurgers &&
                subSandwichesSold >= goalForSubs &&
                soupSold >= goalForSoups) {
            System.out.println("You met your goal for all the items!");}
            else{
                System.out.println("You did not meet the goal on all of your items.");
            }
            }
        }


