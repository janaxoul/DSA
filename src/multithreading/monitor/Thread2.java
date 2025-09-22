package multithreading.monitor;

public class Thread2 extends Thread{
    MyData d;
    public Thread2(MyData data){
        d= data;
    }
    public void run(){
        d.display("welcome to El-cawito's Casino.");
    }
}
