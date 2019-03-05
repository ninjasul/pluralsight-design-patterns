package creational._01_singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance1 = DbSingleton.getInstance();
        DbSingleton instance2 = DbSingleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}