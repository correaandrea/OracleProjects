public class Product {
    //Instance field declarations
    private int itemNumber;
    private String name;
    private int qtyInStock;
    private double pricePerUnit;
    private boolean active = true;

    //Constructor sin parámetros
    public Product() {
        //Permite que el compilador inicialice los campos en sus valores predeterminados.
        //Por defecto, los valores numéricos son 0, las cadenas son null, los valores booleanos son false, etc.
    }

    //Constructor sobrecargado con parámetros
    public Product(int number, String name, int qty, double price) {
        //Inicializa los campos de instancia con valores de los parámetros de entrada.
        this.itemNumber = number;
        this.name = name;
        this.qtyInStock = qty;
        this.pricePerUnit = price;
    }

    //Getters
    public int getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public boolean isActive() {
        return active;
    }

    //Setters
    public void setItemNumber(int number) {
        this.itemNumber = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQtyInStock(int qty) {
        this.qtyInStock = qty;
    }

    public void setPricePerUnit(double price) {
        this.pricePerUnit = price;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    //Calcula el valor total del inventario del producto
    public double getInventoryValue() {
        return qtyInStock * pricePerUnit;
    }

    // Método toString()
    public String toString() {
        return "Item Number: " + itemNumber +
                " \nName: " + name +
                "\nQuantity in stock: " + qtyInStock +
                "\nPrice per unit: " + pricePerUnit +
                "\nStock Value: " + getInventoryValue() +
                "\nProduct Status: " + (isActive() ? "Activo" : "Descatalogado");
    }
}

