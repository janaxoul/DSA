package multithreading.monitor;

public class MyData {
    public void display(String s){
        synchronized (this) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
