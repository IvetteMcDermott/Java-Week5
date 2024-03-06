package LeapYearScV;

public class LeapYearScV {

    // variables
    private int year;
    private String msg;

    // constructor
    public LeapYearScV() {
        year = 0;
        msg = " ";
    }

    // set
    public void setYear(int year) {
        this.year = year;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // compute
    public void computeLeapYear() {
        // if year div by 4 evenly, first condition
        if (year % 4 == 0) {
            // if year div by 100 NOT evenly, second condition
            if (year % 100 != 0) {
                msg = " is Leap Year";
            } else {
                // if year div by 100 evenly, EXCEPTION: also div by 400, third condition
                if (year % 400 == 0) {
                    msg = " is Leap Year";
                } else {
                    // if year div by 100 evenly
                    msg = " is Not Leap Year";
                }
            }
        } else {
            // if year div by 4 NOT evenly,
            msg = " is Not Leap Year";
        }
    }

    // get
    public String getMsg() {
        return msg;
    }

}
