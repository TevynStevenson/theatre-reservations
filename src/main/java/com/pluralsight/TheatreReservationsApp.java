package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatreReservationsApp {
    public static void main(String[] args) {

        // Import scanner
        // Declare scanner
        //Prompt user for their full name

        Scanner myScanner = new Scanner(System.in);

        //Prompt user for their full name, date of the show and the number of tickets
        System.out.print("Please enter your name");
        String name = myScanner.nextLine().trim();

        //Prompt user for the date of their show
        System.out.print("What date will you be coming? MM/dd/yyyy");
        String date = myScanner.nextLine().trim();

        //Prompt user for the number of tickets
        System.out.print("How many tickets would you like?");
        int tickets = Integer.parseInt(myScanner.nextLine());

        //Initialize inputs
        String[] namePieces = name.split(" ");

        //Get a variable to hold first name and last name
        String firstName = namePieces[0];
        String lastName = namePieces[1];

        // Split the dates
        String[] concertDate = date.split("/ /");

        //Get a variable to hold the date
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //Create a date out of the date format they gave us
        LocalDate dateOfEvent = LocalDate.parse(date, dateFormat);

        //Use a ternary
        String ticketsCount = (tickets == 1) ? "ticket": "tickets";

        //Print out the output
        System.out.printf("%d %s reserved for %s under %s, %s%n",
                tickets, ticketsCount, dateOfEvent, lastName, firstName);
















    }
}
