package collection;

import java.util.*;

public class LearnCollectionJava {
    public static void main(String[] args) {

        System.out.println("Welcome to Java Collection Framework...!");

        /*
        *creating collection:
        * 1) Type safe collection-same types of objects are added to collection
        * 2) Non-type safe collection - different types of objects can be added to collection...
        *
        */


        //Type safe collection Example...
        //Example -01(Type safe)
        //ArrayList example
        System.out.println("Type safe collection example...");
        System.out.println("Example - ArrayList()");
        ArrayList<String> names = new ArrayList<>();
        names.add("Taimur");
        names.add("Taimur");//duplicates are allowed in ArrayList()
        //names.add(1234);//showing error can not add int object...because of type safe... we only add String type values in it.
        names.add("Wasim");
        names.add("Nahi");
        names.add("Aiyaan");
        System.out.println(names); // output: [Taimur, Taimur, Wasim, Nahi, Aiyaan]
                                              //0         1      2     3      4 ->index number
        //check indexed collection...
        //get(int index) method to find the value of certain indexed.
        System.out.println(names.get(0)); //output: Taimur


        //Properties of List Interface in Collection framework...
        /* output: [Taimur, Taimur, Wasim, Nahi, Aiyaan]
        * Properties of List collection Interface
        * see the output, orders are preserved...
        * Indexed Collection...[0, 1, 2, ....]
        * orders are preserved in List
        * Duplicates are allowed
        *
        * */
        System.out.println();
        System.out.println();





        //Non-Type safe collection...
        //Example -01 (Non-type safe)
        //ArrayList() example...
        System.out.println("1-Un type or Non-Type safe collection example...");
        System.out.println("Example - ArrayList()");
        ArrayList name = new ArrayList();//we can add any types of object here...
        name.add("Taimur");
        name.add(1235);
        name.add(12.15650);
        name.add(true);
        System.out.println(name);

        System.out.println();



        //Non-Type safe collection...
        //Example -02(Non-type safe)
        //LinkedList example
        System.out.println("2- Untype or Non-Type safe collection example...");
        System.out.println("Example - LinkedList()");
        LinkedList list = new LinkedList();//we can add any types of object here...
        list.add("Taimur");
        list.add(1235);
        list.add(12.15650);
        list.add(true);

        System.out.println(name);



    }
}
