package lab_8;
public class New extends Customer {
    public New() {
        super();
    }

    public New(String name, double purchasesCost) {
        super(name, purchasesCost);
    }

    public String toString() {
        return "New " + super.toString();
    }
}
