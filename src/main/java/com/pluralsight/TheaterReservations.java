package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask for the full name//
        System.out.println("What is your full name? ");
        String fullName = input.nextLine().trim();

        //Prompt what Date they'll be  coming. (MM/dd/yyyy)//

        System.out.println("What date will you be coming? (MM/dd/yyyy)");
        String arrivalInput = input.nextLine().trim();

        //Create the date time formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(arrivalInput, formatter);

        //How many tickets

        System.out.println("How many tickets would you like?");
        int tickets = input.nextInt();

        //Find the first and last name
        int nameSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0,nameSpace);
        String lastName = fullName.substring(nameSpace + 1);

        //(# ticket(s) reserved for (date) under (LastName, FirstName)
        System.out.print(tickets);
        System.out.print(tickets == 1 ? " ticket " : " tickets ");
        System.out.print("reserved for " + localDate + " under" + lastName + "," + firstName);


    }
}
