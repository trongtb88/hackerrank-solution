package DEA.Session2;

public class SingletonExample2 {
    private SingletonExample2() {}

    private static class LazySingleton {
        private static final SingletonExample2 INSTANCE = new SingletonExample2();
    }

    public static SingletonExample2 getSingleton() { return LazySingleton.INSTANCE;
    }

}
