package multithreading;
class ExtendingThread extends Thread{
    public ExtendingThread(String name){
        super(name);
        setPriority(NORM_PRIORITY);
    }
    public void run(){
        int i=0;
        while(true){
            System.out.println(i++ +" Thread");
        }
    }
}
public class ThreadConstAndMethods {
    public static void main(String[] args) throws InterruptedException {
        ExtendingThread th= new ExtendingThread("newThread");
        th.start();

        int i=0;
        while(true){
            System.out.println(i++ +" Main");
//            Thread.yield();
        }

    }
}
