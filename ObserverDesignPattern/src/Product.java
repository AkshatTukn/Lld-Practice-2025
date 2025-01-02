public interface Product {
    // Amazon notify me problem
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);


    void notifyUsers(String data);

    void setInStock(boolean inStock, String additionalData);

}
