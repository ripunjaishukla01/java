
import java.util.ArrayList;
import java.util.Scanner;

// Product class (Encapsulation)
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// CartItem (Composition)
class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}

// Shopping Cart
class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("🛒 Cart is empty!");
            return;
        }
        double total = 0;
        System.out.println("\n--- Shopping Cart ---");
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() + " x " + item.getQuantity() +
                    " = " + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total: " + total);
    }
}

// Main Program
public class Example129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        ShoppingCart cart = new ShoppingCart();

        // Some products
        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Phone", 20000));
        products.add(new Product(3, "Headphones", 2000));

        while (true) {
            System.out.println("\n--- 🛍️ Shopping Menu ---");
            System.out.println("1. Show Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. Show Cart");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Products ---");
                    for (Product p : products) {
                        System.out.println(p.getId() + ". " + p.getName() + " - ₹" + p.getPrice());
                    }
                    break;
                case 2:
                    System.out.print("Enter Product ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    Product selected = null;
                    for (Product p : products) {
                        if (p.getId() == pid)
                            selected = p;
                    }
                    if (selected != null) {
                        cart.addItem(selected, qty);
                        System.out.println("✅ Added to cart!");
                    } else {
                        System.out.println("❌ Invalid Product ID!");
                    }
                    break;
                case 3:
                    cart.showCart();
                    break;
                case 0:
                    System.out.println("👋 Thank you for shopping!");
                    sc.close();
                    return;
                default:
                    System.out.println("⚠️ Invalid choice!");
            }
        }
    }
}
