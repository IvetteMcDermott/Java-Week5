package Venues;

import java.util.Scanner;

public class VenuesAppScV {

    public static void main(String[] args) {
        // Open scanner
        Scanner sc = new Scanner(System.in);

        // variables
        int year;
        String programme;
        String msg;

        // object
        VenuesScV Ve;
        Ve = new VenuesScV();

        // input
        System.out.println("\nEnter the year you currently in:");
        year = sc.nextInt();
        sc.nextLine(); // This line have to be add (It consumes the \n character) from StackOverFlow

        System.out.println("\nEnter your programme:");
        programme = sc.nextLine();

        // set
        Ve.setYear(year);
        Ve.setProgramme(programme);

        // compute
        Ve.computeVenue();

        // get
        msg = Ve.getMsg();

        // output
        System.out.println("\nDear student, the location for your Big Night Out is " + msg + "\n");

        // close scanner
        sc.close();

    }
}
