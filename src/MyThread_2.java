public class MyThread_2 implements Runnable {

    @Override
    public void run() {
        int counter = 0;
        int i = 1;
        while (i > 0) {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter = counter + 5;
            System.out.println("thread_2: " + "Прошло 5 секунд");
            i++;
        }
    }
}
