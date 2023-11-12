import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeedCode206 {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Stack<Integer> steck=new Stack<>();
        steck.addAll(list);
        list.clear();
        int k=steck.size();
        for (int i = 0; i <k; i++) {
            list.add(steck.pop());
        }
        System.out.println(list);

    }
}