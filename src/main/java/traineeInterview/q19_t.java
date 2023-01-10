package traineeInterview;

public class q19_t extends Thread {
    public static void main(String[] args) {
        q19_t t = new  q19_t();
        t.run();
    }

    public void run () {
        for (int i = 1; i < 3; i++) {
            System.out.println(i + "//");
        }
    }
}
