
import java.util.Scanner;

public class WeekDays {

    public static String getDayOfWeek(int day) {
        if (day == 1) {
            return "Monday";
        }
        if (day == 2) {
            return "Tuesday";
        }
        if (day == 3) {
            return "Wednesday";
        }
        if (day == 4) {
            return "Thursday";
        }
        if (day == 5) {
            return "Friday";
        }
        if (day == 6) {
            return "Saturday";
        }
        if (day == 7) {
            return "Sunday";
        }
        return "Invalid";
    }

    public static boolean canVote(int age, boolean hasVoterID, boolean isCitizen) {
        if (age >= 18 && hasVoterID && isCitizen) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = scanner.nextInt();
        System.out.println("Day: " + getDayOfWeek(day));

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have a VoterS Card? (Yes/No): ");
        boolean hasVoterID = scanner.nextBoolean();
        System.out.print("Are you a citizen? (Yes/No): ");
        boolean isCitizen = scanner.nextBoolean();
        System.out.println("You can vote: " + canVote(age, hasVoterID, isCitizen));

        scanner.close();
    }
}
