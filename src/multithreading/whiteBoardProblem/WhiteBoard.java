package multithreading.whiteBoardProblem;

public class WhiteBoard {
    String text;
    int noStudents=0;
    int count=0;
    public void attendance(){
        noStudents++;
    }
    synchronized void write(String text){
        while(count!=0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Teacher wrote: "+ text);
        this.text= text;

        count= noStudents;
        notifyAll();

    }
    synchronized String read(){
        while(count==0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String str;
        str= text;
        count--;
        if(count==0){
            notify();
        }
        return str;
    }
}
