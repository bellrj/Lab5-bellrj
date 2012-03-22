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
	
	@Test
	public void testEight(){
		assertEquals(list(2,2,2), PrimeFactorization.getPrimeFactors(8));
	}
	
	@Test
	public void testNine(){
		assertEquals(list(3,3), PrimeFactorization.getPrimeFactors(9));
	}
	
	@Test
	public void testBigNumber(){
		assertEquals(list(5,7,7,1327), PrimeFactorization.getPrimeFactors(325115));
	}
	
	public ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
	
	@Test
	public void testGetLesserThan1(){
		assertEquals(list(), PrimeFactorization.getLesserPrimes(1));
	}
	
	@Test
	public void testGetLesserThan2(){
		assertEquals(list(), PrimeFactorization.getLesserPrimes(2));
	}
	
	@Test
	public void testGetLesserThan3(){
		assertEquals(list(2), PrimeFactorization.getLesserPrimes(3));
	}
	
	
}
