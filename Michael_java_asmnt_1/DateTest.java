// ex 3.14

public class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getter and setter methods for month
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    // Getter and setter methods for day
    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    // Getter and setter methods for year
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    // Method to display date in MM/DD/YYYY format
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d%n", month, day, year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date(4, 26, 2024);

        // Display the date
        System.out.print("Date: ");
        date.displayDate();

        // Update the date
        date.setMonth(12);
        date.setDay(31);
        date.setYear(2024);

        // Display the updated date
        System.out.print("Updated Date: ");
        date.displayDate();
    }
}