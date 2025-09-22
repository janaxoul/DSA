package multithreading.interThreadCommunication;

public class Main {
    public static void main(String[] args) {
        Data mydata= new Data();
        Producer p= new Producer(mydata);
        Consumer c= new Consumer(mydata);
        p.start();
        c.start();
    }
}
