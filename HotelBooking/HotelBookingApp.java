package HotelBooking;

import java.util.Scanner;

public class HotelBookingApp {
    public static void main(String[] args) {

        // open scanner
        Scanner sc = new Scanner(System.in);

        // variables
        String client;
        String msgB;
        String msg;
        int nights;
        int age;
        int conf;

        // objects
        HotelBooking HBScV;
        HBScV = new HotelBooking();

        // inputs
        System.out.println("Enter the name for the booking please:");
        client = sc.nextLine();

        System.out.println("Enter the client's age");
        age = sc.nextInt();

        System.out.println("Enter the number of nights to stay with us");
        nights = sc.nextInt();

        System.out.println("\n Confirm the booking: 1. Yes  2. No");
        conf = sc.nextInt();

        // set
        HBScV.setClient(client);
        HBScV.setAge(age);
        HBScV.setNights(nights);
        HBScV.setConf(conf);

        // compute
        HBScV.computeBooking();

        // get
        msg = HBScV.getMsgB();

        // output
        System.out.println(msgB);

        HBScV.setConf(conf);

        // compute
        // HBScV.computeConfirm();

        // get
        msg = HBScV.getMsg();

        // output
        System.out.println(msg);

        // close scanner
        sc.close();

    }

}
