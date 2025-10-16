public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;

   
    public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLiter, double percentageDiscount) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;   
    }
  
    public void setLocation(String location) {
        this.location = location;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public void setPricePerLiter(double pricePerLiter) {
        if (pricePerLiter > 0.0) {
            this.pricePerLiter = pricePerLiter;
        }
    }

    public void setPercentageDiscount(double percentageDiscount) {
        if (percentageDiscount >= 0.0 && percentageDiscount <= 100.0) {
            this.percentageDiscount = percentageDiscount;
        }
    }
 
    public String getLocation() {
        return location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getQuantity() {
        return quantity;
    }


    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }
 
    public double getPurchaseAmount() {
        double totalAmount = quantity * pricePerLiter;
        double discount = totalAmount * (percentageDiscount / 100);
        return totalAmount - discount;
    }
}
