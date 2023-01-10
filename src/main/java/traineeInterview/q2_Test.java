package traineeInterview;

public class q2_Test implements Runnable{
    String x, y;


    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            synchronized (this) {
                x = "Hello";
                y = "Java";
                System.out.println(x + " " + y + " ");
            }
        }
    }

    public static void main(String[] args) {
        q2_Test run = new q2_Test();
        Thread obj1 = new Thread(run);
        Thread obj2 = new Thread(run);
        obj1.start();
        obj2.start();
    }
}
