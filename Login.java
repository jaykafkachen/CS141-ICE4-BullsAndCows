Class Login extends Password
{
  public Login()
  {
    super(generatePass()); //calls abstract constructor to set password value to the created password
  }
  public char[] generatePass() //overridden generatePass() method from superclass Password
  //in order to generate valid characters for password, use ints and RNG for ASCII values 33-126 (http://www.asciitable.com/) which is basically all digits, letters (caps and lower), and special symbols such as ^ or ! 

  public boolean guess() //overridden from Superclass Password, prompts user to guess password til they get it (returns true if they do, false if they exit)
}
