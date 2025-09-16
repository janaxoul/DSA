package recursion;

public class TaylorSeries {
    static double p=1;
    static double f=1;
    public static double e(int x, int n){
        double r=1;
        if(n==0){
            return 1;
        }
        r=1+(x/n)+r; //Honer's method
        //r=e(x-n-1); //normal's method
        //p*=p;
        //f*=f;
        // return r+(p/f);
        return e(x, n-1);
    }
    public static void main(String[] args){
        System.out.println(e(0,1));
    }

}
