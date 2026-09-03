package oop.assigment_problems;

/** A product initialised in one step through its constructor. */
class Product {
    String productId;
    String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}

/**
 * Week 3 - Assignment Problem L4 : Basic Constructor for a Product.
 */
public class ProductConstructor {

    public static void main(String[] args) {
        Product product = new Product("P-1042", "Wireless Mouse");

        System.out.println(product.productId + " - " + product.productName);
    }
}
