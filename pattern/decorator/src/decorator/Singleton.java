package decorator;

public class Singleton {
    private volatile static Singleton uniqueInstance;

    static int referenceCount;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }

        }
        referenceCount++;
        return uniqueInstance;

    }

    public int getReferenceCount() {
        return referenceCount;
    }

}
