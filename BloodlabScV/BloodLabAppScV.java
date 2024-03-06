package BloodlabScV;

import java.util.Scanner;

public class BloodLabAppScV {
    public static void main(String[] args) {

        // open scanner
        Scanner sc = new Scanner(System.in);

        // variables
        int age;
        String bloodT;
        String msg;

        // object
        BloodLabScV BTL;
        BTL = new BloodLabScV();

        // User input
        System.out.println("Enter your age:");
        age = sc.nextInt();
        sc.nextLine(); // This line have to be add (It consumes the \n character) from StackOverFlow

        System.out.println("Enter your blood type:");
        bloodT = sc.nextLine();

        // set
        BTL.setBloodT(bloodT);
        BTL.setAge(age);

        // compute
        BTL.computeBloodLab();

        // get
        msg = BTL.getMsg();

        // outcome
        System.out.println(msg);

        // close scanner
        sc.close();

    }
}