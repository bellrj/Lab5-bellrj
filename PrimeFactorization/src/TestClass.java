import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


public class TestClass  extends TestCase{

	@Test
	public void testOne() {
		assertEquals(list(),PrimeFactorization.getPrimeFactors(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(2), PrimeFactorization.getPrimeFactors(2));
	}
	
	public ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
