package recursion;

public class Combination {

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return fact(n-1)*n;
    }

    public static int ncr(int n, int r){
        if(n<=1)
            return 1;
        else{
            return fact(n)/(fact(n-r)*fact(r));
        }
    }
    public static int NCR(int n, int r){
        if(n==r || r==0){
            return 1;
        }
        return NCR(n-1, r-1)+NCR(n-1,r);
    }

    public static void main(String[] args) {
        System.out.println(NCR(5,2));
    }
}
