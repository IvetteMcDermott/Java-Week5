package LeapYearScV;

import java.util.Scanner;

public class LeapYearAppScV {
    public static void main(String[] args) {
        // Open scanner
        Scanner sc = new Scanner(System.in);

        // variables
        int year;
        String msg;

        // object
        LeapYearScV LY;
        LY = new LeapYearScV();

        // User input
        System.out.println("Enter a year:");
        year = sc.nextInt();

        // set
        LY.setYear(year);

        // compute
        LY.computeLeapYear();

        // get
        msg = LY.getMsg();

        // output
        System.out.println("\n" + year + msg + "\n");

        // close scanner
        sc.close();
    }

}
