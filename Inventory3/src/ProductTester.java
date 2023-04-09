import java.util.Scanner;
public class ProductTester {
    public static void main(String[] args) {
        int maxSize = -1;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println("Enter the number of products you would like to add");
                System.out.println("Enter 0 (zero) if you do not wish to add products:");
                maxSize = Integer.parseInt(scanner.nextLine());

                if (maxSize < 0) {
                    System.out.println("Incorrect value entered");
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect data type entered.");
                scanner.nextLine();
            }
        } while (maxSize < 0);

        if (maxSize == 0) {
            System.out.println("No products required.");
        } else {
            Product[] products = new Product[maxSize];

            for (int i = 0; i < maxSize; i++) {
                scanner.nextLine(); // Clear input buffer

                System.out.println("Enter the name of the product:");
                String name = scanner.nextLine();

                System.out.println("Enter the quantity of the product:");
                int quantity = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the price of the product:");
                double price = Double.parseDouble(scanner.nextLine());

                int number = i + 1;
                products[i] = new Product(name, quantity, price, number);
            }

            for (Product product : products) {
                System.out.println("Product #" + product.getNumber() + ": " + product.getName() + " | Quantity: " + product.getQuantity() + " | Price: $" + product.getPrice());
            }
        }

        scanner.close();
    }
}