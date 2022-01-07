////Kindly use the input file 'InputForAssignment4' for inputs
import java.util.GregorianCalendar;
public class C9E5GregorianCalendar {
    GregorianCalendar date = new GregorianCalendar();
    int year;
    String month;
    int day;

    //Constructor
    public C9E5GregorianCalendar() {
        year = date.get(GregorianCalendar.YEAR);
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
        int monthNumber = date.get(GregorianCalendar.MONTH);
        switch (monthNumber) {
            case 0:  month = "January";
                     break;
            case 1:  month = "February";
                     break;
            case 2:  month = "March";
                     break;
            case 3:  month = "April";
                     break;
            case 4:  month = "May";
                     break;
            case 5:  month = "June";
                     break;
            case 6:  month = "July";
                     break;
            case 7:  month = "August";
                     break;
            case 8:  month = "September";
                     break;
            case 9: month = "October";
                     break;
            case 10: month = "November";
                     break;
            case 11: month = "December";
                     break;
            default: month = "Invalid month";
                     break;
        }
    }

    public void setTime() {
        date.setTimeInMillis(1234567898765L);
        year = date.get(GregorianCalendar.YEAR);
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
        int monthNumber = date.get(GregorianCalendar.MONTH);
        switch (monthNumber) {
            case 0:  month = "January";
                     break;
            case 1:  month = "February";
                     break;
            case 2:  month = "March";
                     break;
            case 3:  month = "April";
                     break;
            case 4:  month = "May";
                     break;
            case 5:  month = "June";
                     break;
            case 6:  month = "July";
                     break;
            case 7:  month = "August";
                     break;
            case 8:  month = "September";
                     break;
            case 9: month = "October";
                     break;
            case 10: month = "November";
                     break;
            case 11: month = "December";
                     break;
            default: month = "Invalid month";
                     break;
        }
    }
    public static void main(String[] args) {
        System.out.println("This program uses GregorianCalendar - an inbuilt class of java to find current date and time as per the Gregorian Calendar.");
        System.out.println("Here we will first print the date as per the gregorian calendar, and then we will print the date by setting the initial time to January 1, 1970.\n");
        C9E5GregorianCalendar date = new C9E5GregorianCalendar();
        System.out.println("Today's date as per the Gregorian Calendar is: " + date.day + " " + date.month + " " + date.year);
        date.setTime();
        System.out.println("\nToday's date as per the Gregorian calendar, when the first day is set to January 1, 1970 is: " + date.day + " " + date.month + " " + date.year);
    }
}