
public class User implements Observer{
   String name;
   String data;
   public User(String name)
   {
       this.name=name;
   }

    @Override
    public void notifyObserver(String data) {
        System.out.println("Hi the product named" + data + "is back in town");
    }

    @Override
    public void setObject(String additionalData) {
         this.data=additionalData;
    }

    @Override
    public String getObject() {
        return this.data;
    }
}
