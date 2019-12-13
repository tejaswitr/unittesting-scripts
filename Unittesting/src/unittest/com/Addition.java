package unittest.com;

public class Addition {

	public int sumnumbers(int[] numbers)
	{
		int sum=0;
		for( int number :numbers) {
		sum+=number;
		}
		return sum;
	}
}
