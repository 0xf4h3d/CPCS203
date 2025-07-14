package lab_7;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseArea() {
        return super.getArea();
    }

    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * getBaseArea();
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    public String toString() {
        return super.toString() + ", height=" + height;
    }
}
