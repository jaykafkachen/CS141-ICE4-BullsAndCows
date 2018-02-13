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
  {}
  
  //overridden from Password class, use this to 
  //determine where the digits are incorrect etc basically the bulls and cows rules
  public char[] compare(char[] pass2) 
  {
    char[] places = super.compare(pass2);
  }
  
  //overridden from Superclass Password, prompts user to guess password til they get 
  //(returns true if they do, false if they exit)
  public boolean guess()
  {}
}
