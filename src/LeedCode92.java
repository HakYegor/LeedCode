import java.util.Stack;

public class LeedCode92 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(45);
        stack.add(4);
        stack.add(44);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);


//        if (head == null)
//            return null;
//
//        if (head.next == null)
//            return head;
//
//        ListNode c1 = head;
//        ListNode c2 = head.next;
//

        // if(c2.next==null && left==right){
        //     return head;

        // if(c2.next==null && left!=right){
        //     head=c2;
        //     c2.next=c1;
        //     c1.next=null;
        //     return head;


//        Stack<Integer> stack=new Stack<>();
//        while(c1.val!=left){
//            if(c1.next==null)
//                return head;
//            c1=c1.next;
//        }
//        c2=c1;
//
//        while(c2.val!=right ){
//            if(c2==null){
//                return head;
//            }
//            stack.add(c2.val);
//            c2=c2.next;
//        }
//        stack.add(c2.val);
//        while(c1!=c2){
//            c1.val=stack.pop();
//            c1=c1.next;
//        }
//        c1.val=stack.pop();
//        return head;


    }

    private static class ListNode {
        Integer val;
        ListNode next;

        public ListNode(Integer val, ListNode next, ListNode previous) {
            this.val = val;
            this.next = next;

        }






//        if(list1==null && list2==null)
//                return null;
//
//        if(list1==null && list2!=null){
//            return list2;
//        }else if(list1!=null && list2==null)
//                return list1;
//
//        ListNode c1=list1;
//        ListNode c11=list1;
//        ListNode c2=list2;
//        ListNode c22=list2;
//        while(c1.val<c2.val){
//            c1.next=c2;
//            list2=c1;
//            c11=c11.next;
//            c1=c11;
//        }
//        while(c1==null){
//            if(c2.val < c1.val && c1.val<c2.next.val){
//                c2=c2.next;
//                c22=c22.next;
//            }
//            else{
//                c22=c22.next;
//                c2.next=c1;
//                c11=c11.next;
//                while(c1.next.val<c22.val && c11.val<=c22.val){
//                    c1=c1.next;
//                    c11=c11.next;
//                }
//                c1.next=c22;
//                c2=c22;
//                c1=c11;
//            }
//
//        }
//        return list2;










    }
}
