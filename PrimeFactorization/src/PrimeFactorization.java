import java.util.ArrayList;




public class PrimeFactorization{
	
	public static ArrayList<Integer> getPrimeFactors(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(n%2 == 0)
		{
			list.add(2);
			n /= 2;
		}
		if(n > 1)
		{
			list.add(n);
		}
		return list;
	}

}
