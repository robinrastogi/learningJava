package java2certifiedprogrammer;

public class FiveCount extends Thread {
    Producer producer;
    public static void main(String arg[]) {
        FiveCount fc = new FiveCount();
        fc.start();
    }
    FiveCount() {
        producer = new Producer(this);
        producer.start();
    }
    public void run() {
       while(true) {
           showValue();
       }
    }
    synchronized void showValue() {
        try {
            wait();
        } catch(InterruptedException e) {
            return;
        }
        int value = producer.getValue();
        System.out.println("Consumer: " + value);
    }
}

class Producer extends Thread {
    private int value;
    Object monitor;
    Producer(Object monitor) {
        this.monitor = monitor;
    }
    public void run() {
        while(true) {
            try {
                sleep(5000);
            } catch(InterruptedException e) {
                return;
            }
            sendValue();
        }
    }
    void sendValue() {
        value += 5;
        System.out.println("Producer: " + value);
        synchronized(monitor) {
            monitor.notify();
        }
    }
    public int getValue() {
        return(value);
    }
}
            
