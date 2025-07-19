public class AbsoluteValues {
    public static void main(String[] args) {
     
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: " + args[i]);
                return;
            }
        }

        
        System.out.println("Absolute values:");
        for (int number : numbers) {
            System.out.println("Absolute value of " + number + " is " + Math.abs(number));
        }
    }
}