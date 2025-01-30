package LearnJavaFiles.Threading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        // Timer
        for (int i = 1; i <= 10; i++) {

            // Thread is considered dangerous code
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

            if (i == 10) {
                System.out.println("Time's up");
                System.exit(0);
            }



        }
    }

}
