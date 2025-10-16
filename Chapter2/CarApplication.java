public class CarApplication {
    public static void main(String[] args) {

        Car car1 = new Car("BENZ AMG", "2025", 30000);
        Car car2 = new Car("LEXUS 350", "2025", 25000);

        System.out.println(car1.getYear() + " " + car1.getModel() + " price: $" + car1.getPrice());
        System.out.println(car2.getYear() + " " + car2.getModel() + " price: $" + car2.getPrice());
        System.out.println();

        double discount1 = car1.getPrice() * 0.05;
        double discount2 = car2.getPrice() * 0.07;

        car1.setPrice(car1.getPrice() - discount1);
        car2.setPrice(car2.getPrice() - discount2);

        System.out.println("After 5% discount, " + car1.getYear() + " " + car1.getModel() + " price: $" + car1.getPrice());
        System.out.println("After 7% discount, " + car2.getYear() + " " + car2.getModel() + " price: $" + car2.getPrice());
    }
}