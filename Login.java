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
		char[] password = new char[6];
		for(int i=0;i<password.length;i++)
		{
			password[i] = (char)(97 + (int)(Math.random() * ((122 - 97) + 1)));
			//System.out.print(password[i]);
		}
		return password;
	}

	  //overridden from Superclass Password, prompts user to guess
	  //password til they get it (returns true if they do, false if they exit)
	public boolean guess() 
	{
		boolean end = false;
		char[] passguess = new char[6];
		char[] truepass = new char[6];
		String input = "";
		Scanner io = new Scanner(System.in);
		while(end!=true)
		{
			System.out.print("\n Guess password\n-->");
			input = io.nextLine();
			while(input.length()!=6)
			{
				System.out.print("Invalid input. Must be 6 letters.");
				System.out.print("\nGuess password\n-->");
				input = io.nextLine();
			}
			passguess = input.toCharArray();
			truepass = compare(passguess);
			if(super.passEquals(truepass, passguess))
				return true;
			else
			{
				System.out.print("Correct so far: (Indexes gives you correct index (0-5) of letter entered)\nYours:   "+String.valueOf(passguess)+"\nIndexes: "); //+ String.valueOf(truepass));
				for(char c:truepass)
				{
					if(Character.isDigit(c))
						System.out.print(c);
					else
						System.out.print("-");
				}
				System.out.print("\nLetters: ");
				for(char c:truepass)
				{
					if(Character.isLetter(c))
						System.out.print(c);
					else
						System.out.print("-");
				}
				//System.out.print("\nDo you want to quit? (y/n)\n-->");
				//if(io.nextLine().equalsIgnoreCase("y"))
				//	end = true;
			}
		}
		return false;
	}

}
