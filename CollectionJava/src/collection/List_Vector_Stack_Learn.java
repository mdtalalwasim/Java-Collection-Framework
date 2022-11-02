package collection;

import java.util.Stack;

public class List_Vector_Stack_Learn {
    public static void main(String[] args) {


        /*
         * HashSet orders are not preserved
         * duplicates are not allowed in HashSet
         * when type safe only same types object can be accepted
         * [Nahi, Taimur, Aiyaan, Wasim, Abdullah] output:
         * output showing that order of the objects are not maintained
         * ignore duplicates objects
         * not indexed collection
         * */



        System.out.println("Stack...");
        Stack st = new Stack();
        st.add("Wasim");
        st.add("Wasim");
        st.add("Wasim");
        st.add("Taimur");
        st.add("Aiyaan");
        st.add("Nahi");
        st.add("Abdullah");
        st.add(1245);
        st.add(true);
        //st.add(12.5586592);//this will pop first. //this is in peek also

        System.out.println("Original stack before any operation is :"+st);

        System.out.println("Pop :"+st.pop());//Follow : LIFO = Last In First Out
        System.out.println("Push :"+st.push("tttt"));
        System.out.println("Peek :"+st.peek());
        System.out.println("Current Stack is :"+st);

        //st.search("true");

        //System.out.println("Current Stack is :" +st);
        System.out.println(st.search("tttt"));//this is on top position of the stack
        System.out.println(st.search(12345));//return -1 because the object is not present in stack
        System.out.println(st.search(1245));//return 2 because the object present in stack at position 2(from the top of the stack)
        System.out.println(st.search("Abdullah"));
        System.out.println(st.search("Taimur"));
        System.out.println(st.search("Wasim"));//return 8, from top of the stack to current object position



    }
}
