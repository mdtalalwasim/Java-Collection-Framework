package collection;

import java.util.ArrayList;

public class List_ArrayList_Learn {
    public static void main(String[] args) {

        /*
         * List is Interface which has 3 child -> 1. ArrayList(this is class) 2.LinkedList(class) 3.Vector(class)
         * in List :
         *   ->orders are preserved
         *   ->duplicates are allowed
         *   ->indexed collection
         * in ArrayList:
         *   ->ArrayList(class) is the Child of List Interface
         *   ->ArrayList  create indexed collection[0,1,2... like Array]
         *   ->ArrayList orders are preserved
         *   ->duplicates are allowed
         *   ->ArrayList work on Dynamic array, size of the array will increase automatically, So it is less efficient than linked List
         *   -> non thread safe class its object at the same time can be used simultaneously by others.
         *   -> all methods are not synchronized
         * */




        System.out.println("ArrayList is...");

        ArrayList name = new ArrayList();
        name.add("Wasim");
        name.add("Wasim");
        name.add("Wasim");
        name.add("Taimur");
        name.add("Aiyaan");
        name.add("Nahi");
        name.add("Abdullah");
        name.add(1245);
        name.add(true);
        name.add(12.5586592);

        System.out.println(name);
        System.out.println();
        System.out.println("get() is : "+ name.get(5));//here 5 is index number..index start with 0, so get the 6th element of list.

        name.remove("Wasim");//this is collection object
        name.remove("Abdullah");//this is collections object
        name.remove(1);//this is List methodsd


        System.out.println("After removing objects...");
        System.out.println(name);
    }
}
