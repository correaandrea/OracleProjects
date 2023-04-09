import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Crear el primer objeto p1
        System.out.println("Introduzca los detalles del primer producto:");
        System.out.print("Número de elemento: ");
        int tempNumber = in.nextInt();
        in.nextLine();
        System.out.print("Nombre: ");
        String tempName = in.nextLine();
        System.out.print("Cantidad: ");
        int tempQty = in.nextInt();
        System.out.print("Precio: ");
        double tempPrice = in.nextDouble();
        Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);

        // Crear el segundo objeto p2
        System.out.println("\nIntroduzca los detalles del segundo producto:");
        in.nextLine();
        System.out.print("Número de elemento: ");
        tempNumber = in.nextInt();
        in.nextLine();
        System.out.print("Nombre: ");
        tempName = in.nextLine();
        System.out.print("Cantidad: ");
        tempQty = in.nextInt();
        System.out.print("Precio: ");
        tempPrice = in.nextDouble();
        Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);

        // Cambiar el estado del producto p2 a descatalogado
        p2.setActive(false);

        // Mostrar los detalles de los productos
        System.out.println("\nDetalles del primer producto:");
        System.out.println(p1.toString());
        System.out.println("Valor del inventario: " + p1.getInventoryValue());

        System.out.println("\nDetalles del segundo producto:");
        System.out.println(p2.toString());
        System.out.println("Valor del inventario: " + p2.getInventoryValue());

        // Cerrar el objeto Scanner
        in.close();
    }
}

