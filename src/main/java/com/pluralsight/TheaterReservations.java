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

    }
}
