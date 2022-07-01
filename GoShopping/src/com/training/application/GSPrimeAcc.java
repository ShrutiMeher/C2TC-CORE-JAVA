package com.training.application;

import com.training.application.*;
import com.training.framework.*;

public class GSPrimeAcc extends PrimeAcc{
	
	private static final float charges = 1000f; // change required 
	
	public GSPrimeAcc(int accNo, String accNm, float charge, boolean isPrime) {
		super(accNo, accNm, charge, isPrime);	
	}
	
	// getter and setter
	public float getCharges() {
			return GSPrimeAcc.charges;
	}
	
	@Override
	public void bookProduct(float book) {
			
	    System.out.println("Prime user your charges are "+ getCharges());
	}

	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}
	
	
}
