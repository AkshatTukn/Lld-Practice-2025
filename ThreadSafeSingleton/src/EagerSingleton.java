public class EagerSingleton {
    // Instance created at the time of class loading
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }
    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}
