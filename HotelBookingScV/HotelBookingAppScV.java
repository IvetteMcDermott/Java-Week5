package HotelBookingScV;

import java.util.Scanner;

public class HotelBookingAppScV {
    public static void main(String[] args) {

        // open scanner
        Scanner sc = new Scanner(System.in);

        // variables
        String client;
        String msg;
        int nights;
        int age;

        // objects
        HotelBookingScV HBScV;
        HBScV = new HotelBookingScV();

        // inputs
        System.out.println("Enter the name for the booking please:");
        client = sc.nextLine();

        System.out.println("Enter the client's age");
        age = sc.nextInt();

        System.out.println("Enter the number of nights to stay with us");
        nights = sc.nextInt();

        // set
        HBScV.setClient(client);
        HBScV.setAge(age);
        HBScV.setNights(nights);

        // compute
        HBScV.computeBooking();

        // get
        msg = HBScV.getMsg();

        // output
        System.out.println(msg);

        // close scanner
        sc.close();

    }

}
