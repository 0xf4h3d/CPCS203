package lab_8;

public class VIP extends Customer {
    private double discountRate = 0.10;
    private double giftCertificateValue = 0;

    public VIP() {
        super();
    }

    public VIP(String name, double purchasesCost) {
        super(name, purchasesCost);
        if (purchasesCost > 1000)
            giftCertificateValue = 100.0;
    }

    public double getPurchasesCost() {
        return super.getPurchasesCost() * (1 - discountRate);
    }

    public double GiftCertificate() {
        return giftCertificateValue;
    }

    public String toString() {
        return "VIP " + super.toString() + " , cost after discount= " + getPurchasesCost();
    }
}
