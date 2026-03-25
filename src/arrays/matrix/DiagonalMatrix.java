package arrays.matrix;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void matrixSet(int [][] matrix){
        Scanner scanner= new Scanner(System.in);
        for(int i= 0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if(i==j){
                    matrix[i][j]= scanner.nextInt();
                }
                else{
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void set(int [][] matrix, int[] A){
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if(i==j){
                    A[i]=matrix[i][j];
                }
            }
        }
    }
    public static void display(int [] [] matrix){
        for(int i= 0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void display(int [] matrix){
        for(int i= 0;i<matrix.length;i++){
                System.out.print(matrix[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[][] matrix= new int[5][5];
        int [] A= new int[5];
        matrixSet(matrix);
        set(matrix, A);
        display(matrix);
        display(A);
    }
}
