package multithreading.whiteBoardProblem;

public class Main {
    public static void main(String[] args) {
        WhiteBoard wt= new WhiteBoard();
        Teacher t= new Teacher(wt);

        Student s1= new Student(wt, "Jana");
        Student s2= new Student(wt, "Guru");
        Student s3= new Student(wt, "Sylver");
        Student s4= new Student(wt, "Hari");
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
