package collection;

import java.util.ArrayList;
import java.util.Vector;

public class List_Vector_Learn {
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


        System.out.println("List Interface <-----Vector class");
        System.out.println("Vector...");

        //non-type safe vector... we can store different data type in it.
        Vector vec = new Vector();

        vec.add("Wasim");
        vec.add("Wasim");//duplicates value allowed
        vec.add("Taimur");
        vec.add("Aiyaan");
//        vec.add("Nahi");
//        vec.add("Abdullah");
//        vec.add(1245);
//        vec.add(true);
//        vec.add(12.5586592);

        System.out.println("Original vector is : "+vec);
        System.out.println();


        System.out.println("vector operation is starting form here......");
        System.out.println();
        System.out.println("vector add() :"+vec.add(1));
        System.out.println("Now vector becomes : "+vec);

        vec.add(0,"Nahi");
        System.out.println(vec);

        System.out.println("0th index value is :"+vec.get(0));//return 0th position value
        System.out.println("Fully Specified class name is :"+vec.getClass());//return fully specified class name
        System.out.println("elementAt (0) is :"+vec.elementAt(0));

        System.out.println("Current Capacity of Vector is :"+vec.capacity());

        //set()
        System.out.println("Current Vector is :"+vec);
        vec.set(0,"Abdullah");
        System.out.println("Now :"+vec);//set will replace the value
        System.out.println();

        //add()
        System.out.println("Current Vector is :"+""+vec);
        vec.add(2,"Nahi");
        System.out.println("Now :"+vec);//add will not replace the value

        System.out.println();
        //copy all element of Vector into ArrayList()
        System.out.println("Copy all the vector elements into ArrayList()...");
        ArrayList arraList = new ArrayList();
        System.out.println(arraList.addAll(vec));//return true.
        System.out.println("ArrayList is :"+arraList);


        System.out.println();






    }
}
