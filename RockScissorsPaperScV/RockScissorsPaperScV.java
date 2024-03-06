package RockScissorsPaperScV;

public class RockScissorsPaperScV {

    // variables
    private int userPick;
    private int pcPick;
    private String msg;

    // constructor
    public RockScissorsPaperScV() {
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
        // if user select 1
        if (userPick == 1) {
            if (pcPick == 2) {
                // System.out.println(pcPick);
                msg = "\n You got Rock VS Pc Paper \n \n You Lose!";
            } else {
                if (pcPick == 3) {
                    // System.out.println(pcPick);
                    msg = "\n You got Rock VS Pc Scissors \n \n You Win!";
                } else {
                    // System.out.println(pcPick);
                    msg = "Both got same... It's a Draw";
                }
            }
        } else if (userPick == 2) {
            if (pcPick == 1) {
                // System.out.println(pcPick);
                msg = "\n You got Paper VS Pc Rock \n \n You Win!";
            } else {
                if (pcPick == 3) {
                    // System.out.println(pcPick);
                    msg = "\n You got Paper VS Pc Scissors \n \n You Lose!";
                } else {
                    // System.out.println(pcPick);
                    msg = "Both got same... It's a Draw";
                }
            }
        } else if (userPick == 3) {
            if (pcPick == 1) {
                // System.out.println(pcPick);
                msg = "\n You got Scissors VS Pc Rock \n \n You Lose!";
            } else {
                if (pcPick == 2) {
                    // System.out.println(pcPick);
                    msg = "\n You got Scissors VS Pc Paper \n \n You Win!";
                } else {
                    // System.out.println(pcPick);
                    msg = "Both got same... It's a Draw";
                }
            }
        } else {
            msg = "Invalid input";
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
