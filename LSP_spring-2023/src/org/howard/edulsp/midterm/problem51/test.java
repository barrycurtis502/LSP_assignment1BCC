package org.howard.edulsp.midterm.problem51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class test {
	//@Test
	//@DisplayName("Testing the size")
	//void size() {
//assertEquals(si)
	@Test
	@DisplayName("Testing the contain")
	void ContainTest() {
		
        Range Range = new Range(3, 40);
        
        assertTrue(Range.contains(7));
        assertTrue(Range.contains(25));
        assertTrue(Range.contains(34));
        assertFalse(Range.contains(2));
        assertFalse(Range.contains(65));
        assertFalse(Range.contains(1));
        assertTrue(Range.contains(37));
        assertTrue(Range.contains(17));
        assertTrue(Range.contains(27));
        assertFalse(Range.contains(80));
        assertFalse(Range.contains(68));
	}

}
