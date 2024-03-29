package multyThreading;

import java.util.concurrent.locks.Lock;

public class ReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        task.firstThread();
                    }
                }
        );
        Thread thread2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        task.secondThread();
                    }
                }
        );
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.showCounter();
    }

    public void lock() {
    }

    public void unlock() {
    }
}

class Task {
    private int counter;
    private ReentrantLock lock = new ReentrantLock();

    private void increment() {
        for (int i = 0; i < 10000; i++) {
            counter++;
        }
    }

    public void firstThread() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void secondThread() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void showCounter() {
        System.out.println(counter);
    }
}