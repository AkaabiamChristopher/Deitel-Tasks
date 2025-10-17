import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter month of birth in figures: ");
        int month = input.nextInt();

        System.out.print("Enter date of birth in figures: ");
        int day = input.nextInt();

        System.out.print("Enter year of birth in figures: ");
        int year = input.nextInt();


        HeartRates person = new HeartRates(firstName, lastName, month, day, year);

        System.out.println("\n------- Heart Rate Information -------");
        System.out.printf("Name: %s %s%n", person.getFirstName(), person.getLastName());
        System.out.printf("Date of Birth: %d/%d/%d%n", person.getBirthDate(), person.getBirthMonth(), person.getBirthYear());
        System.out.printf("Age: %d years%n", person.getAge());
        System.out.printf("Maximum Heart Rate: %d bpm%n", person.getMaximumHeartRate());
        System.out.printf("Target Heart Rate Range: %s%n", person.getTargetHeartRateRange());


    }
}
