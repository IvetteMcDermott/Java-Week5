package RockPaperScissors;

public class RockPaperScissors {

    // variables
    private int userPick;
    private int pcPick;
    private String msg;

    // constructor
    public RockPaperScissors() {
        userPick = 0;
        pcPick = (int) (Math.random() * 3) + 1;
        msg = "";
    }

    // set
    public void setUserPick(int userPick) {
        this.userPick = userPick;
    }

    public void setPcPick(int pcPick) {
        this.pcPick = pcPick;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // compute
    public void computeRSPScV() {
        // draws are set for specific feedback in the else, what was the common choice
        // if user select 1
        if (userPick == 1) {
            if (pcPick == 2) {
                msg = "\nYou got Rock\n           VS \nPc got Paper \n \n=> You Lose!";
            } else {
                if (pcPick == 3) {
                    msg = "\nYou got Rock \n           VS \nPc got Scissors \n \n=> You Win!";
                } else {
                    msg = "Both got Rock... It's a Draw";
                }
            }
        } else if (userPick == 2) { // if user select 2
            if (pcPick == 1) {
                msg = "\nYou got Paper\n           VS \nPc got Rock \n \n=> You Win!";
            } else {
                if (pcPick == 3) {
                    msg = "\nYou got Paper\n           VS \nPc got Scissors \n \n=> You Lose!";
                } else {
                    msg = "Both got Paper... It's a Draw";
                }
            }
        } else if (userPick == 3) { // if user selects 3
            if (pcPick == 1) {
                msg = "\n You got Scissors\n           VS \nPc got Rock \n \n=> You Lose!";
            } else {
                if (pcPick == 2) {
                    msg = "\n You got Scissors\n           VS \nPc got Paper \n \n=> You Win!";
                } else {
                    msg = "Both got Scissors... It's a Draw";
                }
            }
        }
    }

    // get
    public int getPcPick() {
        return pcPick;
    }

    public String getMsg() {
        return msg;
    }

}
