/**
 * 
 */
package org.howard.edulsp.midterm.problem51;

/**
 * @author berry
 *
 */class Range{
	 
	 private int Max;
	 private int Min;

public  Range(int Min, int Max) { 
	this.Min = Min;
	this.Max = Max;
}
		
public boolean contains( int value ) {
	return value >= Min && value <= Max;
	//int v = 0;
	//return(v>=Min && v<=Max);
}  
    // returns true if v is ≥ lower bound and ≤ upper bound, 
    // and false otherwise 
public boolean overlaps( Range other ) throws EmptyRangeException {
	if (other == null) {
		throw new EmptyRangeException();
	}
	int otherMin = ((Range)other).getMin();
   
	
	int otherMax = ((Range)other).getMax();
    
    
    
    return (Min <= otherMax && Max >= otherMin) ||
            (Min >= otherMax && Max <= otherMin) ||
           
            
            (otherMin <= Max && otherMax >= Min);
	
	} 
    private int getMin() {
	// TODO Auto-generated method stub
	return 0;
}

	private int getMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	// returns true if the receiver contains at least 
    // one value in common with other, and false otherwise 
    //  EmptyRangeException is thrown when a null Range object is passed to the method
public int size() { 
    // returns the number of integers in the range
return Max - Min+1;
}

};

