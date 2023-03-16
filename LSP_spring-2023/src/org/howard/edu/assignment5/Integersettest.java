package org.howard.edu.assignment5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Integersettest {

		private IntegerSet intergerSet;
		private IntegerSet intergerSet2;
		private IntegerSet intergerSet3;
	    List <Integer> list = new ArrayList<Integer>();
	    List <Integer> list2 = new ArrayList<Integer>();

	    List <Integer> list3 = new ArrayList();

	    List <Integer> list5 = new ArrayList();

	    @BeforeEach
	    public void createObject(){
	        list.add(1);
	        list.add(22);
	        list.add(10);
	        list.add(52);
	        list.add(0);
	        list.add(-500);
	        list.add(-30);
	        list.add(-80);

	        intergerSet = new IntegerSet(list);
	        list2.add(8);
	        list2.add(16);
	        list2.add(94);
	        list2.add(37);
	        list2.add(2);
	        list2.add(-45);
	        list2.add(-61);
	        list2.add(-82);

	        intergerSet2 = new IntegerSet(list);
	        
	        list3.add(11);
	        list3.add(2);
	        list3.add(101);
	        list3.add(522);
	        list3.add(0);
	        list3.add(-500);
	        list3.add(-30);
	        list3.add(-80);

	        intergerSet3 = new IntegerSet(list3);

	    }
	     

	    @Test
	    @DisplayName("Testing the constructor")
	    void constructorTest(){
	        assertEquals(list, intergerSet.getSet());
	    }



	    @Test
	    @DisplayName("Test getset")
	    void getSet() {
	        assertEquals(list, intergerSet.getSet());
	    }

	    
	    @Test
	    @DisplayName("Test case for clear")
	    void clear() {
	        intergerSet.clear();
	        assertEquals(0, intergerSet.getSet().size());
	    }
	    @Test
	    @DisplayName("test if ....")
	    void contains() {
	        assertEquals(false, intergerSet.contains(2));
	    }



	    @Test
	    @DisplayName("IntegerSetException test largest")
	    void largestNull() {
	        List <Integer> list = new ArrayList();

	        intergerSet.setSet(list);
	        Exception exception = assertThrows(NullPointerException.class, () ->
	                intergerSet.largest());
	        assertEquals("IntegerSetException", exception.getMessage());
	    }

	    @Test
	    @DisplayName("test case for largest")
	    void largest() {
	        assertEquals(52, intergerSet.largest());
	    }

	    @Test
	    @DisplayName("test")
	    void largestFail() {
	        assertNotEquals(1, intergerSet.largest());
	    }

	    @Test
	    @DisplayName("test case for IntergerException Smallest")
	    void smallestNull() {
	        List <Integer> list = new ArrayList();

	        intergerSet.setSet(list);
	        Exception exception = assertThrows(NullPointerException.class, () ->
	                intergerSet.smallest());
	        assertEquals("IntegerSetException", exception.getMessage());
	    }

	    @Test
	    @DisplayName("test case for smallest")
	    void smallest() {
	        assertEquals(-500, intergerSet.smallest());
	    }

	    @Test
	    @DisplayName("test")
	    void smallestFail() {
	        assertNotEquals(1, intergerSet.smallest());
		}
		 @Test
		 @DisplayName("Test Case for Length")
		 void length() {
			 assertEquals(8, intergerSet.length());
		 }
		 @Test
		 @DisplayName("tests if sets are equal")
		 void equal() {
			 
			 assertEquals(false, list.equals(list2));
		 } 


		    @Test
		    @DisplayName("test case for remove")
		    void remove() {
		        intergerSet.remove(1);
		        intergerSet.getSet();
		        boolean valueAddTest = intergerSet.getSet().contains(1);
		        assertTrue(valueAddTest);
		    }
		    @Test
		    @DisplayName("test add")
		    void add() {
		        intergerSet.add(77);
		        boolean valueAddTest = intergerSet.getSet().contains(77);
		        assertEquals(true, valueAddTest);
		    }


		    @Test
		    @DisplayName("test case for union")
		    void union() {
		        intergerSet.union(intergerSet3);
		        intergerSet.length();
		        assertEquals(12, intergerSet.length());
		    }

		    @Test
		    @DisplayName("test case for intersect")
		    void intersect() {
		        intergerSet.intersect(intergerSet3);
		        intergerSet.length();
		        assertEquals(4, intergerSet.length());
		    }


		    @Test
		    @DisplayName("test difference between two set method diff")
		    void diff() {
		        intergerSet.diff(intergerSet3);
		        intergerSet.length();
		        assertEquals(8, intergerSet.length());
		    }

		    @Test
		    @DisplayName("testing if the set is empty")
		    void isEmpty() {
		        IntegerSet integerSet5 = new IntegerSet(list5);
		        assertTrue(integerSet5.isEmpty());
		        assertFalse(intergerSet.isEmpty());
		    }
		    @Test
		    @DisplayName("test case for string")
		    void testToString() {
		        String string1 = "IntegerSet{" +
		                "set=" + intergerSet.getSet() +
		                '}';
		        String string2 = "IntegerSet{set=[10, 22, 10, 52, 0, -5002, -10, -80]}";
		        String regex = "\\{\\{ (.+?) \\| .+? \\}\\}";
		        System.out.println(new String(string1));
		        System.out.println(new String(intergerSet.toString()));
		        assertTrue(new String(string1.replace('{', ' ').replace('}', ' ')).equals(new String(intergerSet.toString().replace('{', ' ').replace('}', ' '))));
		        assertFalse( string2.equals(new String(intergerSet.toString())));
		    }


		 
	}
