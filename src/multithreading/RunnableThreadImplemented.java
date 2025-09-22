package multithreading;

public class RunnableThreadImplemented implements Runnable{
    public void run(){
        RunnableThreadImplemented rt= new RunnableThreadImplemented();
        rt.displayHello();
    }
    public void displayHello(){
        int i=0;
        while(i<100){
            System.out.println(i+" hello Runnable");
            i++;
        }
    }
}
