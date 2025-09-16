import java.util.Scanner;

public class Temp {
    public static void function(int n, String s){
        int count=0;
        StringBuilder sb= new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            System.out.println(sb.charAt(i));
            System.out.println(sb.charAt(i+1));
            if(sb.charAt(i)==sb.charAt(i+1)){
                char modified= (char)(1-(int)sb.charAt(i+1));
                sb.setCharAt(i+1, modified);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        for (int t = 0; t < testCases; t++) {
            int length = sc.nextInt();
            String binString = sc.nextLine();
            function(length, binString);
        }
    }
}
