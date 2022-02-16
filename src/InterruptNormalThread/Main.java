package InterruptNormalThread;
import static java.lang.Thread.currentThread;

class Loader implements Runnable {
    @Override
    public void run() {
//    currentThread().getName() -> to get a name of current thread

        System.out.println("hello from ->" + currentThread().getName());
//        try {
//            System.out.println("hi i'm a from try block \n");
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
////            e.printStackTrace();
//            System.out.println("Thread is Interupted");
//        }
//
//        System.out.println("Loader Thread: Seconds have passed I'm awake");

        for (int i = 0; i < 5; i++)
            System.out.println(i);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("from main thread.");
        Thread rv = new Thread(new Loader());
//        changing default name of thread
        rv.setName(" ==Loader Thread==");
        rv.start();
        rv.interrupt();
        System.out.println("hello again from main");

        System.out.println("thread interrupt flag = "+rv.isInterrupted());

    }
}

