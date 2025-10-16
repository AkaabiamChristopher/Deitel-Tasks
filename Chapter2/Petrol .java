public class Petrol {
    public static void main(String[] args) {
     
        PetrolPurchase purchase = new PetrolPurchase("Lagos", "Diesel", 50, 650.00, 10.0);

        System.out.println("Station Location: " + purchase.getLocation());

        System.out.println("Petrol Type: " + purchase.getPetrolType());

        System.out.println("Quantity (Liters): " + purchase.getQuantity());

        System.out.println("Price per Liter: ₦" + purchase.getPricePerLiter());

        System.out.println("Discount: " + purchase.getPercentageDiscount() + "%");

        
        System.out.printf("Net Purchase Amount: ₦%.2f%n", purchase.getPurchaseAmount());
    }
}
