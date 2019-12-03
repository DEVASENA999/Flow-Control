public class P15 
{
	public static void main(String[] args)
              {
		int number = 1234;
		int sum = 0;
		while (number != 0)
                               {
			sum += number % 10;
			number /= 10;
		}
		System.out.println(sum);
	}
}