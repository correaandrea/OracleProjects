import java.util.Scanner;

public class Product {
    private String name;
    private int quantity;
    private double price;
    private int number;

    public Product(String name, int quantity, double price, int number) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
}