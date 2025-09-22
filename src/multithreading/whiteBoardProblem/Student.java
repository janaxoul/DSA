package multithreading.whiteBoardProblem;

public class Student extends Thread {
    WhiteBoard wb;
    String name;
    public Student(WhiteBoard wb, String name){
        this.wb=wb;
        this.name= name;
    }
    public void run(){
        String text;
        wb.attendance();
        do {
            text=wb.read();
            System.out.println(name+" Reading "+ text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}
