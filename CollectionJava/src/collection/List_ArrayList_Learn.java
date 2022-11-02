package collection;

import java.util.ArrayList;

public class List_ArrayList_Learn {
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



        System.out.println("ArrayList...");

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

        name.remove("Wasim");//this is collection object
        name.remove("Abdullah");//this is collections object
        name.remove(1);//this is List methodsd
        System.out.println("After removing objects...");
        System.out.println(name);
    }
}
