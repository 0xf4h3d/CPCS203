package lab_8;
import java.util.Scanner;

public class Customer {
    private String name;
    private double purchasesCost;

    public Customer() {
        this.name = "";
        this.purchasesCost = 0;
    }

    public Customer(String name, double purchasesCost) {
        this.name = name;
        this.purchasesCost = purchasesCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurchasesCost() {
        return purchasesCost;
    }

    public void setPurchasesCost(double purchasesCost) {
        this.purchasesCost = purchasesCost;
    }

    public void ReadCustInfo(Scanner in) {
        System.out.print("Enter customer's name: ");
        name = in.nextLine();
        System.out.print("Enter customer's Purchases Cost: ");
        purchasesCost = Double.parseDouble(in.nextLine());
    }

    public String toString() {
        return "Customer name: " + name + " , his/her purchases' Cost: " + purchasesCost;
    }
}
