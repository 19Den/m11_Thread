public class MyThread_1 implements Runnable {
    public static int counter = 0;

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            synchronized (MyThread.y) {
                counter = counter + 1;
                System.out.println("От начала сессии прошло " + counter);
                if (counter % 5 == 0) {
                    MyThread.y.notify();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}