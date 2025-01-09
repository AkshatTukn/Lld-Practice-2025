public class Singleton {
    private static Singleton instance;

    // thread safe access to prevent instantion
    //Double-checked locking ensures that synchronization overhead occurs only when instance is null,
    // i.e., during the first initialization. Subsequent calls avoid synchronization, improving performance.
    public static Singleton getInstance()
    {
          if(instance == null)
          {
              // first check to ensure no lock
              synchronized (Singleton.class) {
                  if (instance == null)
                  {
                      // second check (Thread safe)
                      instance = new Singleton();
                  }
              }
          }
          return instance;
    }

}
