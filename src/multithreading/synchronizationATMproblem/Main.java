package multithreading.synchronizationATMproblem;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1= new Customer("Jana", atm, 3500);
        Customer c2= new Customer("Guru K", atm, 6000);
        c1.start();
        c2.start();
    }
}
