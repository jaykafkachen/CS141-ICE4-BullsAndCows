Class TwoFactorAuth extends Password
{
public TwoFactorAuth()
{
  super(generatePass()); //calls the superclass constructor, passing in the char[] from generate pass
}

public char[] generatePass() //overridden generatePass() method from superclass Password
//in order to continue using char[] for the password, make sure to convert randomly generated ints to their character equivalents (heres the ASCII table again http://www.asciitable.com/)

public boolean compare(char[] pass2) //overridden from Password class, use this to determine where the digits are incorrect etc basically the bulls and cows rules
  {
  }

public boolean guess() //overridden from Superclass Password, prompts user to guess password til they get it (returns true if they do, false if they exit)
}
