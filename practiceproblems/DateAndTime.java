import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day-1);
        int dayOfTheWeek = cal.get(Calendar.DAY_OF_WEEK);
        return switch (dayOfTheWeek) {
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            case 3 -> "WEDNESDAY";
            case 4 -> "THURSDAY";
            case 5 -> "FRIDAY";
            case 6 -> "SATURDAY";
            case 7 -> "SUNDAY";
            default -> "did not work";
        };
    }

}

public class DateAndTime {
    public static void main(String[] args) {

        int month = 8;

        // int day = Integer.parseInt(firstMultipleInput[1]);
        int day = 5;

        // int year = Integer.parseInt(firstMultipleInput[2]);
        int year = 2015;

        String res = Result.findDay(month, day, year);

        System.out.print(res);

    }
}
