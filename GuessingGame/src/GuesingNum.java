/*H update*/
/*Hi Leon*/
//asdf
//askdhflkasdhfjkasdlf
//asdjiogaklsdgh aodhgasdkhgkasdfhgajklw4htl
import java.util.Scanner;
import java.util.InputMismatchException;
//Leon You Pd 6-7 yaaa 
public class GuesingNum 
{
	public static void main (String[]args)
	{
		/*changeeee test*/
		/**
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, what is your name?");
		String S = input.next();
		System.out.println("Nice to meet you " + S);
		System.out.println("How old are you?");
		int A = input.nextInt();
		if(A<=25)
		{
			System.out.println("Wow, you are young.");
		}
		else
		{
			System.out.println("Wow, time is passing by fast");
		}
		*/
		int answer = (int)Math.random()*10+1; 
		int guess = 0;
		while(guess!=answer)
		{
			boolean isNumber = false;
			while(!isNumber)
			{
				try
				{
					System.out.println("enter your guess");
					guess = input.nextInt();
					isNumber = true;
				}
				catch(InputMismatchException e )
				{
					System.out.println("There was error type" + e);
				}
			}
		}
	}
}
