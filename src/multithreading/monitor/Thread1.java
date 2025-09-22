package multithreading.monitor;

public class Thread1 extends Thread{
    MyData d;
    public Thread1(MyData data){
        d= data;
    }
    public void run(){
        d.display("Hello World is so huge to write");
    }
}
