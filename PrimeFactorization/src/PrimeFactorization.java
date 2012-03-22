import java.util.ArrayList;




public class PrimeFactorization{
	
	public static ArrayList<Integer> getPrimeFactors(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(n > 1)
		{
			list.add(n);
		}
		return list;
	}

}
