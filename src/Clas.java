import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Clas {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight","hj"};
//        if(strs.length==0){
//            return "";
//        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int k = 0; 

        int leng;
        if (first.length() > last.length())
            leng = last.length();
        else leng = first.length();

        for (int i = 0; i < leng; i++) {
            if (first.charAt(i) == last.charAt(i)) {
                k++;
            } else break;
        }
        if(k==0){
            System.out.println("kkk");
        }else System.out.println(first.substring(0,k));


//        for (String a : strs) {
//            System.out.println(a);
//        }


    }
}
