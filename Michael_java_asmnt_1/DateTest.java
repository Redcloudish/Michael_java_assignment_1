// ex 3.14

public class Date {
    private int month;
    private int day;
    private int year;

    
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    
    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

   
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d%n", month, day, year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        
        Date date = new Date(4, 26, 2024);

        
        System.out.print("Date: ");
        date.displayDate();

        
        date.setMonth(12);
        date.setDay(31);
        date.setYear(2024);

        
        System.out.print("Updated Date: ");
        date.displayDate();
    }
}