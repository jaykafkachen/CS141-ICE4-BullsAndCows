import java.util.*;

class Driver
{
  public static void main(String[] cheese)
  {
        Scanner io = new Scanner(System.in);
        char playFlag = 'y';
        boolean proceed = true;
        System.out.println("Welcome to the Password Guessing Game!");
        do
        { 
          Login lvlOne = new Login();
          System.out.println("Level 1: Guess a random password of 8 characters, letters and numbers only with hints:");
          proceed = lvlOne.guess();
          if(proceed)
          {
            TwoFactorAuth lvlTwo = new TwoFactorAuth();
            System.out.println("Congratulations! You may now advance to...\nLevel 2: Guess a random 3-5 digit authentication code with hints.");
            proceed = lvl2.guess();
          }
          if(proceed)
            System.out.println("Congratulations! You have solved the password guessing game.");
          else
            System.out.println("Give up? Better luck next time!");

          System.out.println("Would you like to play again? ('y'/'n')");
          playFlag = io.next().charAt(0);
        } while(Character.toLowerCase(playFlag)==('y'));
  }
}
