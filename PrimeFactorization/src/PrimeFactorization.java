import java.util.ArrayList;




public class PrimeFactorization{
	
	public static ArrayList<Integer> getPrimeFactors(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int num = 2; n > 1;num++)
		{
			while(n%num == 0)
			{
				list.add(num);
				n /= num;
			}
		}
		return list;
	}

	public static ArrayList<Integer> getLesserPrimes(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(i>=3){
			list.add(2);
		}
		return list;
	}

}
