package RockScissorsPaperScV;

import java.util.Scanner;

public class RockScissorsPaperAppScV {
    public static void main(String[] args) {
        // Open scanner
        Scanner sc = new Scanner(System.in);

        // variables
        int userPick;
        int pcPick;
        String msg;

        // object
        RockScissorsPaperScV RSP;
        RSP = new RockScissorsPaperScV();

        // user input
        System.out.println("Pick one of the numbers: 1. Rock 2. Scissors 3. Paper");
        userPick = sc.nextInt();

        // set
        RSP.setUserPick(userPick);

        // compute
        RSP.computeRSPScV();

        // get
        pcPick = RSP.getPcPick();
        msg = RSP.getMsg();

        // output with conditional to validate the selection is in range
        if (userPick > 3 || userPick < 1) {
            System.out.println("\n" + msg);
        } else {
            System.out.println("Pc: " + pcPick);
            System.out.println("\n" + msg);
        }

        // close scanner
        sc.close();

    }
}