import java.util.ArrayList;
import java.util.List;

public class PhysicalObject implements Product{
     List<Observer> observerList = new ArrayList<>();
    private boolean inStock;
    private String name;

     public PhysicalObject(String name)
     {
         this.name=name;
         this.inStock=false;
     }

    @Override
    public void subscribe(Observer observer) {
         observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
       observerList.remove(observer);
    }

    @Override
    public void notifyUsers( String data) {
         this.inStock = inStock;
             for(Observer observer:observerList)
             {
                 observer.setObject(data);
                 // name of the product
                 observer.notifyObserver(name);
             }

    }

    @Override
    public void setInStock(boolean inStock, String additionalData) {
         this.inStock= inStock;
         if(inStock)
         {
             notifyUsers(additionalData);
         }

    }
}
