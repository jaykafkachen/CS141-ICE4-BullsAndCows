import java.util.*;

public class Driver {

	public static void main(String[] args) 
	{
	    Scanner io = new Scanner(System.in);
	    char playFlag = 'y';
	    boolean proceed = true;
	    System.out.println("Welcome to the Password Guessing Game!\n");
	    do
	    { 
	      Login lvlOne = new Login();
	      System.out.println("\nLevel 1: Guess a random password of 6 lowercase letters:\n(hints for indexes and correct letters)");
	      proceed = lvlOne.guess();
	      if(proceed)
	      {
	        TwoFactorAuth lvlTwo = new TwoFactorAuth();
	        System.out.println("Congratulations! You may now advance to...\nLevel 2: Guess a random 3-5 digit authentication code (with hints).");
	        proceed = lvlTwo.guess();
	      }
	      if(proceed)
	        System.out.println("Congratulations! You have solved the password guessing game.");
	      else
	        System.out.println("\nGive up? Better luck next time!");
	        
	      System.out.print("Would you like to play again? ('y'/'n')\n-->");
	      playFlag = io.next().charAt(0);
	      io.nextLine();
	    } while(Character.toLowerCase(playFlag)==('y'));
	}

}
