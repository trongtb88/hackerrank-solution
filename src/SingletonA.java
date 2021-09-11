public class SingletonA {

    private static SingletonA singletonA = null;

    private SingletonA() {}

    public static SingletonA getSingletonA() {
        if (singletonA == null) {
            synchronized (SingletonA.class) {
                singletonA = new SingletonA();
            }
        }
        return singletonA;
    }
}
