import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;


    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }


    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        if ((birthDate != null) && (birthDate.isBefore(today) || birthDate.isEqual(today))) {
            return Period.between(birthDate, today).getYears();
        } else {
            return 0;
        }
    }


    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRateRange() {
        double maxRate = getMaximumHeartRate();
        double lowerRange = maxRate * 0.50;
        double upperRange = maxRate * 0.85;
        return String.format("%.0f - %.0f bpm", lowerRange, upperRange);
    }
}
