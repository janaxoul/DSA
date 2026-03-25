package recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void generatePowerset(String s, String string, List<String> res, int index) {
        if(index==s.length()){
            res.add(string);
            return;
        }
        generatePowerset(s,string+(Character.toString(s.charAt(index))), res, index+1);
        generatePowerset(s,string, res, index+1);
    }

    public static void main(String[] args) {
        String s= "abc";
        List<String> res= new ArrayList<>();
        generatePowerset(s,"", res, 0);
        System.out.println(res);
    }

}
