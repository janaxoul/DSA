package recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinaryStrings {
    public static void generateString(int n, List<String> strings, char lastChar, String string){
        if(string.length()==n) {
            strings.add(string);
            return;
        }
        if (lastChar == '0') {
            generateString(n, strings, '0', string + '0');
            generateString(n, strings, '1', string + '1');
        } else {
            generateString(n, strings, '0', string + '0');
        }
    }

    public static void main(String[] args) {
        int input=3;
        int size=1;
        List<String> strings= new ArrayList<>();
        generateString(input, strings, '0', "0");
        generateString(input, strings, '1', "1");
        System.out.println(strings);
    }
}
