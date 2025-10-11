package singleton;

public class SingletonClassExample {

    // 1. Private static instance of class
    private static SingletonClassExample instance;

    // 2. Private constructor to prevent/ avoid instantiation/object

    private SingletonClassExample(){

    }

    //3 Public static method to provide access to the instance/object

    public static SingletonClassExample getInstance(){
        if(instance == null){
            instance = new SingletonClassExample();
        }
        return instance;
    }
}
