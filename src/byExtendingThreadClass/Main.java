package byExtendingThreadClass;

class Loader extends Thread{
    @Override
    public void run() {
        System.out.println("hello");
    }
}

public class Main {
    public static void main(String[] args) {
        Loader rv = new Loader();
        rv.start();
    }
}
