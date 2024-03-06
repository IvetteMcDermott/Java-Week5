package RockPaperScissors;

import javax.swing.JOptionPane;

public class RockPaperScissorsApp {
    public static void main(String[] args) {

        // variables
        int userPick;
        int pcPick;
        String msg;

        // object
        RockPaperScissors RSP;
        RSP = new RockPaperScissors();

        // user input
        userPick = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Pick:(1, 2 or 3) \n1. Rock \n2. Paper \n3. Scissors "));

        // set
        RSP.setUserPick(userPick);

        // compute
        RSP.computeRSPScV();

        // get
        pcPick = RSP.getPcPick();
        msg = RSP.getMsg();

        // output
        // conditional to validate the right input for choice
        if (userPick > 3 || userPick < 1) {
            JOptionPane.showMessageDialog(null, "Invalid input. Game exit");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Pc: " + pcPick);
            JOptionPane.showMessageDialog(null, "\n" + msg);
        }
    }
}