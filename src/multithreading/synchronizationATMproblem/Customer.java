package multithreading.synchronizationATMproblem;

public class Customer extends Thread {
    ATM atm;
    String name;
    int amount;
    public Customer(String name, ATM atm, int amount){
        this.name=name;
        this.amount= amount;
        this.atm= atm;
    }
    public void useAtm(){
        atm.checkBalance(name);
        atm.withdrawAmount(name, amount);
    }
    public void run(){
        useAtm();
    }
}
