
public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] years = {2000, 1900, 2024, 2023};
        for (int year : years) {
            System.out.println(year + ": " + isLeapYear(year));
        }
    }
}
