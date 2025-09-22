package multithreading.synchronizationATMproblem;

public class ATM {
    synchronized void checkBalance(String name){
        System.out.print("Checking...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Your Balance: "+name.length()*1000);
    }
    synchronized public void withdrawAmount(String name, int amount){
        if(amount>(name.length()*1000) || amount<0){
            System.out.println("Not enough balance");
        }
        else {
            System.out.println("Withdrawing....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Amount withdrawn :"+amount);
        }
    }

}
