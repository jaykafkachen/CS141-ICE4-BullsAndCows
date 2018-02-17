import java.util.*;

class TwoFactorAuth extends Password
{
  public TwoFactorAuth()
  {
    super(); 
  }
  
  //overridden generatePass() method from superclass Password
  //in order to continue using char[] for the password, make sure to convert random
  //generated ints to their character equivalents (heres the ASCII table again http://www
  //.asciitable.com/)
  public char[] generatePass() 
  {
        
    char[] pass2 = new char[3];
 
    for(int i=0; i<pass2.length; i++)
    {
    	pass2[i] = (char)(48 + (int)(Math.random() * (57-48) + 1));
    }
    return pass2;
  }
  
  //overridden from Password class, use this to 
  //determine where the digits are incorrect etc basically the bulls and cows rules
  public char[] compare(char[] pass2) 
  {
    char[] places = super.compare(pass2);
    return places;
  }
  
  //overridden from Superclass Password, prompts user to guess password til they get 
  //(returns true if they do, false if they exit)
  public boolean guess()
  {
	  Scanner kb = new Scanner(System.in);
	  boolean end2 = false;
	  int digit = 0;
	  String input2 = "";
	  char[] passguess2 = new char[digit];
	  char[] truepass2 = new char[digit];
	  
	  System.out.print("Is the numerical password 3, 4, or 5 digits?");
	  digit = kb.nextInt();
	  while(end2!=true)
	  {
		System.out.print("\n Guess the password\n-->");
		input2 = kb.nextLine();
	  	while(input2.length() != digit)
	  		{
	  			System.out.print("Invalid input. Must be " + digit + "numbers.");
	  			System.out.print("\nGuess password\n-->");
	  			input2 = kb.nextLine();
	  		}
	  	passguess2 = input2.toCharArray();
	  	truepass2 = compare(passguess2);
	  	if(truepass2.toString().equals(passguess2.toString()))
			return true;
	  	else
	  	{
	  		System.out.print("Correct so far: (Indexes gives you correct index of number entered)\nYours;	"+String.valueOf(passguess2)+"\nIndexes: ");
	  		for(char c2:truepass2)
	  		{
	  			if(Character.isDigit(c2))
	  				System.out.print(c2);
	  			else
	  				System.out.print("-");
	  		}
	  		System.out.print("\nDo you want to quit? (y/n)\n-->");
	  		if(kb.nextLine().equalsIgnoreCase("y"))
	  			end2 = true;
	  	}
	  }
	  return false;
  }
}
