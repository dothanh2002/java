import java.util.Scanner;
public class InventoryManagement {
    private Product[] products;
    private int productCount;

    public InventoryManagement() {
        products = new Product[100];
        productCount = 0;
    }

    public void addProduct(String id, String name, double price, int quantity) {
        if (productCount >= 100) {
            System.out.println("CSDL đã đầy");
            return;
        }
        products[productCount] = new Product(id, name, price, quantity);
        productCount++;
        System.out.println("Sản phẩm đã được thêm vào kho.");
    }
}

