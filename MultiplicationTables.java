package com.company;
import java.util.Scanner;


public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size;
        System.out.println("Welcome to Multiplication Tables");
        System.out.println("How large would you like to see them? ");
        size = keyboard.nextInt();
        while (size > 20 || size < 0) {
            System.out.println("Please enter a number between 0 and 20");
            size = keyboard.nextInt();
        }
        for(int row = 0; row <= size; row++) {
            for(int col = 0; col <= size; col++) {
                System.out.println(row + " * " + col + " = "+ (row*col));
            }
        }

    }
}
