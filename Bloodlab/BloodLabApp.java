package Bloodlab;

// import java.util.Scanner;
import javax.swing.JOptionPane;

public class BloodLabApp {
    public static void main(String[] args) {

        // variables
        int age;
        String bloodT;
        String msg;

        // object
        BloodLab BTL;
        BTL = new BloodLab();

        // User input
        age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age:"));
        bloodT = JOptionPane.showInputDialog(null, "Enter your blood type:");

        // set
        BTL.setBloodT(bloodT);
        BTL.setAge(age);

        // compute
        BTL.computeBloodLab();

        // get
        msg = BTL.getMsg();

        // outcome
        JOptionPane.showMessageDialog(null, msg);

    }
}