package multithreading.monitor;

public class Monitor {
    public static void main(String[] args) {
        MyData d= new MyData();
        Thread1 t1= new Thread1(d);
        Thread2 t2= new Thread2(d);
        t1.start();
        t2.start();

    }
}
