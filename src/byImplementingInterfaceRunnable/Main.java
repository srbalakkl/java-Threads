package byImplementingInterfaceRunnable;

class Loader implements Runnable{
    @Override
    public void run() {
        System.out.println("Hellogf");
    }
}
public class Main {
    public static void main(String[] args) {
        Thread rv = new Thread(new Loader());
        rv.start();

    }
}
