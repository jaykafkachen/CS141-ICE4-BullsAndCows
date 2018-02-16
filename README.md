# CS141-ICE4-BullsAndCows
Reference this link for the 2nd Factor Authentication 
http://www.cpp.edu/~ukjayarathna/courses/f17/cs140/files/project2/Programming_Project_2.pdf

Password Guessing Game ("Bulls and Cows")

TO DO: //Put your name wherever you can work on stuff
- Implement the password generator for 2FactorAuth, which generates a 3-5 digit random password comprised of ints (Tyler)

- Implement the 2FactorAuth class guess method (The bulls and cows system described in the link above) //use the compare method in the Password class (Tyler)

DONE:
- Driver that runs and determines which class object is called when (JAY) 
- Password class with compare() method that returns an char array of the correct letters if guessed in right spot, the index of correct letters placed in the wrong place, and '-' character for incorrect altogether letters. this method can be used for both guess() methods
- Implement the password generator for Login, which works on ASCII values and ints to generate 6 letter passwords of lowercase chars(JAY)
- Implement the Login class guess method (glorified hangman) //use the compare method in the Password class (JAY)
--NOTE guess() method formats output to make it easier to guess the password with bull/cow style hints (aka if right place right letter, given that letter like in hangman. if right letter wrong place, given the index where that letter belongs. if neither, then prints '-')
