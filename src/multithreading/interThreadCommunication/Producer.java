package multithreading.interThreadCommunication;

public class Producer extends Thread {
    Data data;
    public Producer(Data data){
        this.data= data;
    }
    public void run(){
        int i=0;
        while(true){
            data.setValue(i);
            System.out.println(i+ ": Produced");
            i++;
        }
    }
}
