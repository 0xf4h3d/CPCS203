package lab_8;

public class Regular extends Customer {
    private double discountRate = 0.05;

    public Regular() {
        super();
    }

    public Regular(String name, double purchasesCost) {
        super(name, purchasesCost);
    }

    public double getPurchasesCost() {
        return super.getPurchasesCost() * (1 - discountRate);
    }

    public String toString() {
        return "Regular " + super.toString() + " , cost after discount= " + getPurchasesCost();
    }
}
