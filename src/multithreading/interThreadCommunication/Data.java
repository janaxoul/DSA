package multithreading.interThreadCommunication;

public class Data {
    int value;
    boolean flag=true;
     synchronized void setValue(int v) {
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.value= v;
        flag= false;
        notify();
    }
     synchronized int getValue() {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int x;
        x=value;
         flag= true;
         notify();

        return x;
    }
}
