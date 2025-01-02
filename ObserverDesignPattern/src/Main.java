public class Main {
    public static void main(String[] args) {
        // Create a product
        Product product = new PhysicalObject("Samsung Galaxy S25");

        // Create users
        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        // Users subscribe to the product
        product.subscribe(user1);
        product.subscribe(user2);

        System.out.println("Product is out of stock...");

        // Product is now in stock with additional data
        product.setInStock(true, "Price: $999, Stock: 20 units");
    }
}