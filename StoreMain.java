package lab_8;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of customers for the day: ");
        int n = Integer.parseInt(input.nextLine());

        Customer[] customers = new Customer[n];
        double totalIncome = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------------------------------------");
            String name;
            double cost;
            char type;

            System.out.print("Enter customer's name: ");
            name = input.nextLine();

            System.out.print("Enter customer's Purchases Cost: ");
            cost = Double.parseDouble(input.nextLine());

            System.out.print("Enter customer's type (V for VIP, R for Regular and N for New): ");
            type = input.nextLine().toLowerCase().charAt(0);

            switch (type) {
                case 'v':
                    customers[i] = new VIP(name, cost);
                    break;
                case 'r':
                    customers[i] = new Regular(name, cost);
                    break;
                default:
                    customers[i] = new New(name, cost);
                    break;
            }
        }

        System.out.println("------------------------------------------------------------");

        for (Customer c : customers) {
            if (c instanceof VIP) {
                VIP v = (VIP) c;
                if (v.GiftCertificate() > 0)
                    System.out.println("Congratulation . You Won " + v.GiftCertificate() + " SR. gift certificate");
            }
            System.out.println(c.toString());
            totalIncome += c.getPurchasesCost();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("Current day income = " + totalIncome + "SR");
        System.out.println("-------------------------------------------------------------");

        input.close();
    }
}
