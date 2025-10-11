package singleton;

public class TestThreadSafeSingleton
{
    public static void main(String[] args) {
        Runnable runnable = ()->{
            SingletonThreadSafe.getInstance().displayMessage();
        };

       Thread th1 =  new Thread(runnable);
       Thread th2 =  new Thread(runnable);
       Thread th3 =  new Thread(runnable);
       Thread th4 =  new Thread(runnable);


       th1.start();
       th2.start();
       th3.start();
       th4.start();
       try {
           th1.join();
           th2.join();
           th3.join();
           th4.join();
       }catch (InterruptedException e){
           e.printStackTrace();
       }
    }
}
