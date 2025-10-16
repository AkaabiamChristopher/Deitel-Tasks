public class ClockTest {
    public static void main(String[] args) {
        
        Clock clock1 = new Clock(13, 45, 30);
        System.out.print("Clock 1 time: ");
        clock1.displayTime();

        Clock clock2 = new Clock(25, 70, 90);
        System.out.print("Clock 2 time: ");
        clock2.displayTime();

        clock1.setHour(22);
        clock1.setMinute(59);
        clock1.setSecond(50);

        System.out.print("Updated Clock 1 time: ");
        clock1.displayTime();

        clock1.setMinute(75);
        System.out.print("After invalid minute, Clock 1 time: ");
        clock1.displayTime();
    }
}
