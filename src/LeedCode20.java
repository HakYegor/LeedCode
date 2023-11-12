import java.util.Objects;
import java.util.Stack;

public class LeedCode20 {
    public static void main(String[] args) {
        String[] s = {"(", "[","]", ")", "a", "{","}" };

        System.out.println(isValid(s));

    }

    public static boolean isValid(String[] str) {
        Stack<String> stack = new Stack<>();
        for (String string : str) {
            if (Objects.equals(string, "(") || Objects.equals(string, "[") || Objects.equals(string, "{")) {
                stack.push(string);

            }
           switch (string){
               case ")":
                 if  (!Objects.equals(stack.pop(), "(")){
                     return false;
                 }
                 break;
               case "]":
                   if  (!Objects.equals(stack.pop(), "[")){
                       return false;
                   }
                   break;
               case "}":
                   if  (!Objects.equals(stack.pop(), "{")){
                       return false;
                   }
                   break;
           }
        }
        return stack.isEmpty();

    }

}


