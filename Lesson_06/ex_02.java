import java.util.Scanner;
public class ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		int fac = 1;
		for (int i = 1; i <= num; i++)
		{
			fac = fac*i;
			System.out.println(fac + " ");
		}
	}
}