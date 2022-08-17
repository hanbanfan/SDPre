import java.util.Calendar;
import java.util.Date;

public class Objective2Lab3 {
  public static void main(String[] args) {
    year = input("Enter your year of birth: ")
    month = input("Enter your birth month: ")
    day= input("What day is it?:")

public class day
{
    public static void main(final String[] args)
    {
        Date today = new Date();
        System.out.println("Is weekend : " + isWeekend(today));

        @SuppressWarnings("deprecation")
        Date someDate = new Date(2021, 0, 2);
        System.out.println("Is weekend : " + isWeekend(someDate));
    }

    public static boolean isWeekend(final Date d)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        int day = cal.get(Calendar.DAY_OF_WEEK);
        return day == Calendar.SATURDAY || day == Calendar.SUNDAY;
    }
}}
