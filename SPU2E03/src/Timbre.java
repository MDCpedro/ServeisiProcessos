import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Timbre {
    private Lock lock = new ReentrantLock();

    public void timbre() {

        lock.lock();
        System.out.print("Ding...");
        try {
            Thread.sleep(2000);
            System.out.println("Dong");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }

    public synchronized void timbre_sync() {
        System.out.print("Ding...");
        try {
            Thread.sleep(2000);
            System.out.println("Dong");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
