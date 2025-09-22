package multithreading;

public class ClassThread {
    public static void main(String[] args) {
        RunnableThreadImplemented rnThread= new RunnableThreadImplemented();
        Thread th= new Thread(rnThread);
        th.start();
        int i=0;
        while(i<100){
            System.out.println(i+" world");
            i++;
        }
    }
}
