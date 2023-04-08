public class Product {
    //Instance field declarations
    private int itemNumber;
    private String name;
    private int qtyInStock;
    private double pricePerUnit;

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
    @Override
    public String toString() {
        return "Item Number : " + itemNumber + "\n" +
                "Name : " + name + "\n" +
                "Quantity in stock: " + qtyInStock + "\n" +
                "Price : " + pricePerUnit;
    }

}
