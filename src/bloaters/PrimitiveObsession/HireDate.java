package bloaters.PrimitiveObsession;

public class HireDate {
    private int year;
    private int month;
    private int day;

    public HireDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getFormattedDate() {
        return year + "-" + month + "-" + day;
    }
}
