package recursion;

public class QuizProblems {
    static int d=1;
    public static void main(String[] args) {
        fun(3);
    }
    public static void fun(int n){
        System.out.print(n);
        System.out.print(d);
        d++;
        if (n>1)
            fun(n-1);
        System.out.print(d);
    }
}
