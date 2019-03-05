package creational._01_singleton.dbsingleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        if( instance != null ) {
            throw new RuntimeException("DbSingleton should be created by getInstance() method.");
        }
    }


    public static DbSingleton getInstance() {

        if( instance == null ) {
            // 성능 향상을 위해 메소드 전체를 동기화 하는 것이 아니라 인스턴스 최초 생성 시에만 동기화를 해 줌.
            synchronized (DbSingleton.class) {
                if( instance == null ) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }
}