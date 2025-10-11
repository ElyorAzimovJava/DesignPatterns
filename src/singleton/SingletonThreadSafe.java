package singleton;

public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe instance;

    private SingletonThreadSafe() {
        System.out.println("The object is created");
    }

    public static SingletonThreadSafe getInstance() {
        if(instance == null){
            synchronized (SingletonThreadSafe.class){
                if(instance == null){
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
    public void displayMessage(){
        System.out.println("The object is displayed");
    }
}
