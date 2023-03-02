package org.howard.edu.lsp.hw4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class driver {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        List<Integer> myList1 = new ArrayList<>();
        List<Integer> myList2 = new ArrayList<>();

        myList.add(1);
        myList.add(20);
        myList.add(3);
        myList.add(100);
        myList.add(102);
        myList.add(0);

        myList1.add(1);
        myList1.add(20);
        myList1.add(3);
        myList1.add(400);
        myList1.add(103);
        myList1.add(70);
        IntegerSet mySet1 = new IntegerSet(myList);

        IntegerSet mySet2 = new IntegerSet(myList1);

        IntegerSet mySet3 = new IntegerSet(myList2);
        
      // mySet1.add(34);
       // mySet1.union(mySet2);
       // mySet1.intersect(mySet2);
       // mySet1.diff(mySet2);

//        System.out.println();
        System.out.println("Set 1 : "+mySet1.getSet());
        System.out.println("Set 2 : "+mySet2.getSet());
        System.out.println("Is equal:"+mySet2.equals(mySet1));
        System.out.println("Largest Element in Set1:" +mySet1.largest());
        System.out.println("Smallest element in set2 : "+mySet2.smallest());
        System.out.println("Largest Element in Set2:" +mySet2.largest());
        System.out.println("Smallest element in set1 : "+mySet1.smallest());
      //  System.out.println(mySet2.equals(mySet1));
        System.out.println("elements in set three are empty: "+mySet3.isEmpty());
   
       // System.out.println("Union: " +mySet1.union(mySet2));
        mySet1.diff(mySet2);
        System.out.println("difference:"+mySet1.toString());
        
        mySet1.union(mySet2);
         System.out.println("Union:"+mySet1.toString());
         
         mySet1.intersect(mySet2);
         System.out.println("Intersect:"+mySet1.toString());

    }
}