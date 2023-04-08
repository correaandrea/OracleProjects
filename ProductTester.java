public class ProductTester {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product(3, "Men's T-Shirt", 10, 15.99);
        Product product4 = new Product(4, "Women's T-Shirt", 15, 12.99);
        Product product5 = new Product(5, "Kid's Hoodie", 5, 29.99);
        Product product6 = new Product(6, "Unisex Baseball Cap", 20, 9.99);

        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
        System.out.println(product4.toString());
        System.out.println(product5.toString());
        System.out.println(product6.toString());
    }
}