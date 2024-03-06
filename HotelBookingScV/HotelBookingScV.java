package HotelBookingScV;

import java.util.Scanner;

public class HotelBookingScV {

    Scanner sc = new Scanner(System.in);

    // variables
    private String client;
    private String msg;
    private String msgB;
    private int nights;
    private int age;
    private int rate;
    private int total;
    private int conf;

    // constructors
    public HotelBookingScV() {
        client = "";
        nights = 0;
        rate = 90;
        total = 0;
        msg = "";
        msgB = "";
        conf = 0;
    }

    // set
    public void setClient(String client) {
        this.client = client;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setConf(int conf) {
        this.conf = conf;
    }

    // compute
    public void computeBooking() {
        total = nights * rate;
        msgB = "\n" + client + ", Your booking is for a total " + total + "\n" + nights + " nights \n"
                + "rate per night "
                + rate;

        if (age >= 18 || age < 99) {
            if (conf == 1) {
                msg = "\n" + client + ", your booking had been registered. \n";
            } else if (conf == 2) {
                msg = "\n" + client + ", your booking have not been processed. \n";
            } else {
                msg = "Input Invalid for confirmation. Booking can not be process.";
            }
        } else if (age < 18) {
            msg = "Age is an Invalid Input";
        } else {
            msg = "Age is an Invalid Input";
        }
    }

    // get
    public String getMsgB() {
        return msgB;
    }

    public String getMsg() {
        return msg;
    }
}