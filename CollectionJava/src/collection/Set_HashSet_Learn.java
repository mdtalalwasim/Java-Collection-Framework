package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set_HashSet_Learn {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        /*
        * HashSet(class) is the child of Set Interface
        * HashSet orders are not preserved
        * duplicates are not allowed in HashSet
        * when type safe only same types object can be accepted
        * [Nahi, Taimur, Aiyaan, Wasim, Abdullah] output:
        * output showing that order of the objects are not maintained
        * ignore duplicates objects
        * not indexed collection
        *
        * */

        hashSet.add("Wasim");//though it will not showing any error when adding same value, but when print the HashSet it omit all duplicates value
        hashSet.add("Wasim");
        hashSet.add("Wasim");
        hashSet.add("Taimur");
        hashSet.add("Aiyaan");
        hashSet.add("Nahi");
        hashSet.add("Abdullah");
        //hashSet.add(1234); //showing error: when type safe only same types object can be accepted

        System.out.println(hashSet);
        // Out put is : [Nahi, Taimur, Aiyaan, Wasim, Abdullah]

        System.out.println();
        System.out.println("---------------------------OTHER OPERATION----------------------------------------");

        System.out.println();
        //Trying to add() the value which is already in HashSet.
        System.out.println("Trying to add() the value which is already in HashSet.");
        hashSet.add("Taimur");//already in HashSet
        System.out.println("RESULT : = Nothing is Changed :"+hashSet);


        System.out.println();
        //Trying to add() the value which is not present in HashSet.
        System.out.println("Trying to add() the value which not present in HashSet.");
        System.out.println("Old HashSet :"+hashSet);
        hashSet.add("Shahed");//already in HashSet
        System.out.println("RESULT : =  Changed :"+hashSet);



        //copy all HashSet object into LinkedHashSet...
        System.out.println();
        System.out.println("Copy all HashSet objects into LinkedHashSet...");
        System.out.println("LinkedHashSet is :");
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(hashSet);
        System.out.println(linkedHashSet);

        //co
        System.out.println();
        System.out.println("Copy all HashSet objects into ArrayList...");
        System.out.println("ArrayList  is :");
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(hashSet);
        System.out.println(arrayList);



    }
}
