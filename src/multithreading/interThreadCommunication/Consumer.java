package multithreading.interThreadCommunication;

public class Consumer extends Thread {
    Data data;
    public Consumer(Data data){
        this.data= data;
    }
    public void run(){
        int i=0;
        while(true){
            System.out.println("Consumed: "+ data.getValue());
            i++;
        }
    }
}
