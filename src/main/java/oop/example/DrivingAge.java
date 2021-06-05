/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.util.Scanner;

public class DrivingAge
{
    public static void main( String[] args )
    {
        System.out.print("What is your age? ");

        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int age = Integer.parseInt(a);

        String output = age > 15 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(output);
    }
}