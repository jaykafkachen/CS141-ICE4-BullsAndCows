import java.util.*;
public class Login extends Password
{

	public Login() 
	{
		super();
	}


	  //overridden generatePass() method from superclass Password
	  //in order to generate valid characters for password, use ints and RNG for ASCII values
	  //97-122 (http://www.asciitable.com/), this generates a char[] of lowercase characters
	  //that you can guess essentially by playing hangman
		
	public char[] generatePass() 
	{
		char[] password = new char[8];
		for(int i=0;i<password.length;i++)
		{
			password[i] = (char)(96 + (int)(Math.random() * ((122 - 96) + 1)));
			//System.out.print(password[i]);
		}
		return password;
	}

	  //overridden from Superclass Password, prompts user to guess
	  //password til they get it (returns true if they do, false if they exit)
	public boolean guess() 
	{
		boolean end = false;
		char[] passguess = new char[8];
		char[] truepass = new char[8];
		String input = "";
		Scanner io = new Scanner(System.in);
		while(end!=true)
		{
			System.out.print("\n Guess password-->");
			input = io.nextLine();
			while(input.length()!=8)
			{
				System.out.print("Invalid input. Must be 8 letters.");
				System.out.print("\nGuess password\n-->");
				input = io.nextLine();
			}
			passguess = input.toCharArray();
			truepass = compare(passguess);
			if(truepass==passguess)
				return true;
			else
			{
				System.out.print("Correct so far: " + String.valueOf(truepass) + "\nCorrect letters: ");
				//print out correct letters too
				System.out.print("\nDo you want to quit? (y/n)\n-->");
				if(io.nextLine().equalsIgnoreCase("y"))
					end = true;
			}
		}
		return false;
	}

}
