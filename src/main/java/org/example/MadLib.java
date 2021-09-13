package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class MadLib
{
    public static void main( String[] args )
    {
        //Define variables
        String noun;
        String verb;
        String adverb;
        String adjective;
        Scanner scan = new Scanner(System.in);

        //Get noun from user
        System.out.println( "Enter a noun: ");
        noun = scan.next();

        // Get verb from user
        System.out.println("Enter a verb: ");
        verb = scan.next();

        //Get adjective from user
        System.out.println("Enter a adjective: ");
        adjective = scan.next();

        //Get adverb from user
        System.out.println("Enter an adverb: ");
        adverb = scan.next();

        //Print MadLib
        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? That's funny!");
    }
}
