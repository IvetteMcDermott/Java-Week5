package BloodlabScV;

public class BloodLabScV {

    // variables
    private String bloodT;
    private int age;
    private String msg;

    // constructor
    public BloodLabScV() {
        bloodT = "";
        age = 0;
        msg = "";
    }

    // set
    public void setBloodT(String bloodT) {
        this.bloodT = bloodT;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // compute
    public void computeBloodLab() {
        if (age < 18) {
            msg = "Under 18 can not donate";
        } else if (age > 99) {
            msg = "Invalid data enter";
        } else {
            if (bloodT.equalsIgnoreCase("ab")) {
                msg = "Can give blood to AB \nCan receive blood from AB, A, B, O";
            } else if (bloodT.equalsIgnoreCase("a")) {
                msg = "Can give blood to A and AB \nCan receive blood from A and O";
            } else if (bloodT.equalsIgnoreCase("b")) {
                msg = "Can give blood to B and AB \nCan receive blood from B and O";
            } else if (bloodT.equalsIgnoreCase("o")) {
                msg = "Can give blood to A, B, O and AB \nCan receive blood from O";
            } else {
                msg = "Invalid data enter";
            }
        }
    }

    // get
    public String getMsg() {
        return msg;
    }

}
