package ThreadIterrupt;

import static java.lang.Thread.currentThread;

class Loader implements Runnable {
    @Override
//    currentThread().getName() -> to get a name of current thread
    public void run() {
        System.out.println("hello from ->" + currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println("Thread is Interupted");

        }
        System.out.println("Loader Thread: Seconds have passed I'm awake");
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
    }
}
