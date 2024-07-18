import java.util.ArrayList;
import java.util.List;

// Interface representing a product
interface Product {
    void showProduct();
    double calculatePrice();
}

// Class representing an online product, implementing the Product interface
class OnlineProduct implements Product {
    private final int productId;
    private final String name;
    private final double price;
    private final double shippingCost;

    public OnlineProduct(int productId, String name, double price, double shippingCost) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.shippingCost = shippingCost;
    }

    @Override
    public void showProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Shipping Cost: Rs." + shippingCost);
    }

    @Override
    public double calculatePrice() {
        return price + shippingCost;
    }
}

// Class representing a physical product, implementing the Product interface
class PhysicalProduct implements Product {
    private final int productId;
    private final String name;
    private final double price;
    private final double weight;

    public PhysicalProduct(int productId, String name, double price, double weight) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void showProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Weight: " + weight + " kg");
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}

// Class representing a customer
class Customer {
    private final int customerId;
    final String name;
    private final String address;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
}

// Class representing an order
class Order {
    private final int orderId;
    private final Customer customer;
    private final List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    void addProduct(Product product) {
        products.add(product);
    }

    // Method to calculate the total price of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.calculatePrice();
        }
        return total;
    }

    // Method to display the order details
    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.name);
        System.out.println("Products:");
        for (Product product : products) {
            product.showProduct();
            System.out.println();
        }
        System.out.println("Total Price: Rs." + calculateTotal());
    }
}

// Main class to test the e-commerce system
public class Product1 {
    public static void main(String[] args) {
        // Create a customer
        Customer customer1 = new Customer(1, "Priti", "123 Main St");
        // Create an order
        Order order1 = new Order(100, customer1);

        // Add products to the order
        order1.addProduct(new OnlineProduct(1, "Laptop", 500, 20));
        order1.addProduct(new PhysicalProduct(2, "Headphones", 100, 0.5));

        // Display the order details
        order1.showOrder();
    }
}

output:

Order ID: 100
Customer: Priti
Products:
Product ID: 1
Name: Laptop
Price: Rs.500.0
Shipping Cost: Rs.20.0

Product ID: 2
Name: Headphones
Price: Rs.100.0
Weight: 0.5 kg

Total Price: Rs.620.0




