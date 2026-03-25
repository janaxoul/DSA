package arrays.matrix;

import java.util.Scanner;

public class LowerTriangularMatrix {
    public int[] A;
    public int n;

    public LowerTriangularMatrix(int n){
        this.n= n;
        this.A=new int[n * (n + 1) / 2];
    }
    public void set(LowerTriangularMatrix m, int i, int j, int x){
        if(i>=j){
            m.A[(i * (i - 1)) / 2 + (j - 1)]=x;
        }
    }
    public int get(LowerTriangularMatrix m, int i, int j){
        if(i>=j){
            return m.A[(i * (i - 1)) / 2 + (j - 1)];
        }
        else {
            return 0;
        }
    }
    public void display(LowerTriangularMatrix matrix){
        for(int i=1;i<=matrix.n; i++){
            for(int j=1;j<=matrix.n;j++){
                if(i>=j){
                    System.out.print(matrix.A[i*(i-1)/2+j-1]+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        LowerTriangularMatrix ltm= new LowerTriangularMatrix(n);
        System.out.println("Enter all elements");
        for(int i=1;i<=ltm.n;i++){
            for(int j=1;j<=ltm.n;j++){
                int x= sc.nextInt();
                ltm.set(ltm, i,j, x);
            }
        }
        System.out.println();
        ltm.display(ltm);
        System.out.println("Array A: ");
        for(int i=0; i<ltm.A.length;i++){
            System.out.print(ltm.A[i]);
        }

    }
}
