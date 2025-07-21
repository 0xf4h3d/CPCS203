package lab_9;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Items> cart = new ArrayList<>();

        System.out.print("Enter number of items to add to cart: ");
        int itemCount = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < itemCount; i++) {
            System.out.println("Item #" + (i + 1));
            System.out.print("Enter item name: ");
            String name = input.nextLine();

            System.out.print("Enter unit price: ");
            double price = input.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            input.nextLine(); 

            Items item = new Items(name, price, quantity);
            cart.add(item);
        }
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("\nItems in your cart:");
        double totalPrice = 0.0;

        for (Items item : cart) {
            System.out.println(item.toString());
            totalPrice += item.getUnitPrice() * item.getQuantity();
        }

        System.out.printf("\nTotal price: %.2f SR\n", totalPrice);
        input.close();
    }
}
