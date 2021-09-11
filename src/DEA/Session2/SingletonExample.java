package DEA.Session2;

public class SingletonExample {
    private SingletonExample() {
    }
    public static final SingletonExample singleton = null;

    public static SingletonExample getSingletonExample() {
        if (singleton == null) {
            synchronized (SingletonExample.class) {
                if (singleton == null) {
                    return singleton;
                }
            }
        }
        return singleton;
    }
}
