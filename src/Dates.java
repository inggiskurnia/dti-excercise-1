import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dates {

    public static int findDifference (String date1, String date2) {

        //Split the date
        String[] date1Split = date1.split("-");
        String[] date2Split = date2.split("-");

        //Convert to integer
        int year1 = Integer.parseInt(date1Split[0]);
        int month1 = Integer.parseInt(date1Split[1]);
        int day1 = Integer.parseInt(date1Split[2]);

        int year2 = Integer.parseInt(date2Split[0]);
        int month2 = Integer.parseInt(date2Split[1]);
        int day2 = Integer.parseInt(date2Split[2]);

        LocalDate a = LocalDate.of(year1, month1, day1);
        LocalDate b = LocalDate.of(year2, month2, day2);

        return (int) ChronoUnit.DAYS.between(a, b);
    }
}
