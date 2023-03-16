package org.howard.edu.assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntegerSet {
    // Hint: probably best to use an array list.  You will need to do a little research
    private List<Integer> set = new ArrayList<Integer>();

    public List<Integer> getSet() {
        return set;
    }

    public IntegerSet(List<Integer> set) {
        this.set = set;
    }

    // Default Constructor
    public IntegerSet() {
    }

    // Clears the internal representation of the set
    public void clear() {
        set.clear();
    };

    // Returns the length of the set
    public int length() {
       return set.size();
    }; // returns the length

    /*s
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     */

    public boolean equals(IntegerSet b) {

        if(b.length() == this.length()){
            for (int val : b.getSet()) {
                if (!set.contains(val)){
                    return false;
                };
            }
        }
        else {
            return false;
        }

        return true;
    };

    // Returns true if the set contains the value, otherwise false
    public boolean contains(int value) {
        return set.contains(value);
    };

    // Returns the largest item in the set; Throws a IntegerSetException if the set is empty
    public Integer largest() {
        if(set.size() == 0){
            throw new NullPointerException("IntegerSetException");
        }
        int max = set.get(0);

        for(int val : set){
            if (val > max){
                max=val;
            }
        }

        return max;
    }

    // Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
    public int smallest()  {

        if(set.size() == 0){
            throw new NullPointerException("IntegerSetException");
        }
        int min = set.get(0);

        for(int val : set){
            if (val < min){
                min=val;
            }
        }

        return min;
    };

    // Adds an item to the set or does nothing it already there
    public void add(int item) {
        if (set.contains(item)){
            return ;
        }
        else{
            set.add(item);
        }
    }; // adds item to the set or does nothing if it is in set

    // Removes an item from the set or does nothing if not there
    public void remove(int item) {
        if (!set.contains(item)){
            return ;
        }
        else{
            set.remove(item);
        }
    };

    // Set union
    public IntegerSet union(IntegerSet intSetb) {
        for(int val : intSetb.getSet()){
            if(!set.contains(val)){
                set.add(val);
            }
        }
		return intSetb;
    };

    // Set intersection
    public void intersect(IntegerSet intSetb) {
        List<Integer> mySet = new ArrayList<Integer>();

        for(int val : intSetb.getSet()){
            if(set.contains(val)){
                mySet.add(val);
            }
        }
        set=mySet;
    };

    // Set difference, i.e., s1 â€“s2
    public void diff(IntegerSet intSetb) {
        List<Integer> mySet = new ArrayList<Integer>();
        for(int val : intSetb.getSet()){
            if(!set.contains(val)){
                mySet.add(val);
            }
        }

        for(int val : set){
            if(!intSetb.getSet().contains(val)){
                mySet.add(val);
            }
        }
        set=mySet;

    } // set difference, i.e. s1 - s2

    // Returns true if the set is empty, false otherwise
    boolean isEmpty(){
        if(set.size()==0){
            return true;
        }
        return false;
    };
    public void setSet(List<Integer> set) {
        this.set = set;
    }

    public String toString() {
        return "IntegerSet{" + "set=" + set + '}';
    }

    ;	// return String representation of your set
}
