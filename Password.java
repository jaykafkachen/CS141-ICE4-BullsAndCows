abstract class Password
{
  private char[] pass; //stores the password generated by the generatePass() method. it is private, and there should be NO get() method in order to protect it. All comparisons done within this class.

  public Password(char[] ps)
  {
    this.pass = ps;
  }
  
  public abstract char[] generatePass(); //returns a character array of the password desired, generated randomly, each subclass should override this
  public abstract boolean guess(); //runs prompt for player to guess pass, compares using this class's compare() method to determine validity, each subclass should override this
  
  /*
  * only this method can tell you whether the password was correct or not, 
  * will be overloaded in the 2FactorAuth Class but work fine as is with login
  */
  public boolean compare(char[] pass2) 
  {
      if(pass.length !== pass2.length)
          return false;
      for(int i = 0; i<pass.length; i++;) {
          if(pass[i] !== pass2[i])
              return false;
      }
      return true;
  }
}
