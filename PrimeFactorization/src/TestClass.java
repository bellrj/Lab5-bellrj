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
	
	@Test
	public void testThree(){
		assertEquals(list(3), PrimeFactorization.getPrimeFactors(3));
	}
	
	@Test
	public void testFour(){
		assertEquals(list(2,2), PrimeFactorization.getPrimeFactors(4));
	}
	
	@Test
	public void testSix(){
		assertEquals(list(2,3), PrimeFactorization.getPrimeFactors(6));
	}
	
	public ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
