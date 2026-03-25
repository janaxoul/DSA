package recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void generateValidPara(String string, int n, List<String> res, int open, int close){
        if(string.length()==2*n){
            res.add(string);
            return;
        }

        if(open>n || close>open){
            return;
        }
        if(open<n){
            generateValidPara(string+"(", n, res, open+1, close);
        }
        if(close<open) {
            generateValidPara(string+")", n, res, open, close+1);
        }

    }
    public static void main(String[] args) {
        List<String> res= new ArrayList<>();
        generateValidPara("",3, res,0,0);
        System.out.println(res);
    }
}
