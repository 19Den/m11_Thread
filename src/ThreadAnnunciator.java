public class MyThread_2 implements Runnable {

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            synchronized (MyThread.y) {
                try {
                    MyThread.y.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Прошло 5 секунд");
                //y.notify();
            }
        }
    }
}