package multithreading;

public class Mythread extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
