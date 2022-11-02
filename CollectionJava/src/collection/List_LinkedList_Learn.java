package collection;

import java.util.*;

public class List_LinkedList_Learn {
    public static void main(String[] args) {


        /*
         * LinkedList(class) is the child of  List Interface
         * LinkedList work on Doubly Linked List
         * LinkedList -> indexed collection
         * LinkedList -> orders are preserved
         * LinkedList -> duplicates are allowed
         * */


        System.out.println("LinkedList...");
        LinkedList list = new LinkedList();
        list.add("Talal");
        list.add("Wasim");
        list.add("Wasim");//duplicates allowed
        list.add("Taimur");
        list.add("Aiyaan");
        list.add("Nahi");
//        list.add("Abdullah");
//        list.add(1245);
//        list.add(true);
//        list.add(12.5586592);

        System.out.println("Original List...");
        System.out.println(list);
        System.out.println();


        //remove()
        //remove(FirstElement)
        System.out.println("After removing First Element...");
        list.remove();//remove first element //Talal will remove
        System.out.println(list);
        //remove(object) and remove(index value)
        System.out.println();
        System.out.println("After remove(object) and remove(index) Element...");
        list.remove("Abdullah");//abdullah object is removed
        list.remove(2);//index value is removed
        System.out.println("Full List :"+list);
        System.out.println("removeFirst : "+list.removeFirst());
        System.out.println("removeLast : "+list.removeLast());
        System.out.println(list);

        //addLast
        System.out.println();
        System.out.println("addLast() method");
        list.addLast("I_am_Last");
        System.out.println(list);



        //add(index, object element)
        System.out.println();
        System.out.println("Full List is now this :"+list);
        System.out.println("After - add(index, object element) method");
        list.add(0,"ImAtIndexZeroElement_FirstElement");//add in 0 index
        System.out.println("List becomes :"+list);




        //clone()
        System.out.println();
        System.out.println("Full List is now this :"+list);
        System.out.println("After clone() method");
        list.clone();//for cloning whole list
        System.out.println(list);

        //contains()
        System.out.println();
        System.out.println("If Contains the given object return true :"+list.contains("Nahi"));

        //get()
        System.out.println();
        System.out.println("0 index Element of the list : "+list.get(0));
        System.out.println("First Element of the list is : "+list.getFirst());//get first element
        System.out.println("Last Element of the list is : "+list.getLast());//get last element
        System.out.println("Get Class name : "+list.getClass());//get class name
        System.out.println("Peek First element from list : "+list.peekFirst());//get first element
        System.out.println("Peek Last element from list : "+list.peekLast());//get last name
        System.out.println("Peek First element from list : "+list.peek());//get first name
        //System.out.println(list);



        //same as removeFirst()
        System.out.println();
        System.out.println(list.isEmpty());

        //pop()
        System.out.println();
        System.out.println("Full List is now this :"+list);
        list.pop();//same as removeFirst()
        System.out.println("After pop :"+list);
        System.out.println(list);

        //push()
        System.out.println();
        System.out.println("Full List is now this :"+list);
        list.push("PushThis");//same as addFirst()
        System.out.println("After push :"+list);
        System.out.println(list);

        //size()
        System.out.println("Size of List is :"+list.size());

        //clear()
        System.out.println();
        System.out.println("Full List is now this :"+list);
        System.out.println("After clear() method");
        list.clear();//list will clear...
        System.out.println("List becomes :"+list);



    }
}
