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

//        rv.start();  gives illegal thread class error

/*      note: below method calling can be used to call Runnable interface thread also but it's not possible
        to use the above method is not applicable for Runnable interface thread.*/

/*        Thread rv = new Thread(new Loader());
        rv.start();*/
    }
}
