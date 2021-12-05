public class MyThread_1 implements Runnable {
    int counter = 0;

    @Override
    public void run() {
        int i = 1;
        while (i > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter = counter + 1;
            System.out.println("thread_1: от начала сессии прошло " + counter);
            i++;
        }
    }
}
