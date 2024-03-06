package Venues;

public class VenuesScV {

    // variables
    private int year;
    private String programme;
    private String lagoona;
    private String harbourmaster;
    private String msg;

    // constructors
    public VenuesScV() {
        year = 0;
        programme = "";
        lagoona = "Lagoona";
        harbourmaster = "Harbourmaster";
        msg = " ";
    }

    // set
    public void setYear(int year) {
        this.year = year;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setLagoona(String lagoona) {
        this.lagoona = lagoona;
    }

    public void setHarbourmaster(String harbourmasater) {
        this.harbourmaster = harbourmasater;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // compute
    public void computeVenue() {
        if (year == 1) {
            if (programme.equalsIgnoreCase("HDAIML")) {
                msg = lagoona;
            } else if (programme.equalsIgnoreCase("HDBC")) {
                msg = harbourmaster;
            } else {
                msg = "can not be found because Invalid data had been enter \nplease try again.";
            }
        } else if (year == 2) {
            if (programme.equalsIgnoreCase("HDBC")) {
                msg = lagoona;
            } else if (programme.equalsIgnoreCase("HDAIML")) {
                msg = harbourmaster;
            } else {
                msg = "can not be found because Invalid data had been enter \nplease try again.";
            }
        } else {
            msg = "can not be found because Invalid data had been enter \nplease try again.";
        }
    }

    // get
    public String getMsg() {
        return msg;
    }
}