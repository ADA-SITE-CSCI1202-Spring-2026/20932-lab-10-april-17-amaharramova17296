import java.util.*;
import java.util.function.Predicate;

class Product {
    String name;
    double price; 
    boolean inStock;

public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

@Override
public String toString() {
    return "Name: " + name + ", Price: " + price + ", In Stock: " + inStock;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> pr = new ArrayList<>();

        pr.add(new Product("shirt", 30.50, true));
        pr.add(new Product("sneakers", 100.0, true));
        pr.add(new Product("pants", 45.0, true));
        pr.add(new Product("gloves", 11.50, false));
        pr.add(new Product("hats", 12.0, true));

        Predicate<Product> isAffordable = p -> p.price < 50.0 && p.inStock;

        pr.removeIf(p -> !isAffordable.test(p));

        pr.forEach(System.out::println);
    }
}