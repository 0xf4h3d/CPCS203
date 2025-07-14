package lab_7;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Default Cylinder: " + cy1.toString());
        System.out.println("Base Area = " + cy1.getBaseArea());
        System.out.println("Surface Area = " + cy1.getArea());
        System.out.println("Volume = " + cy1.getVolume());

        System.out.println();

        Cylinder cy2 = new Cylinder(2.0, 5.0, "blue");
        System.out.println("Custom Cylinder: " + cy2.toString());
        System.out.println("Base Area = " + cy2.getBaseArea());
        System.out.println("Surface Area = " + cy2.getArea());
        System.out.println("Volume = " + cy2.getVolume());
    }
}
