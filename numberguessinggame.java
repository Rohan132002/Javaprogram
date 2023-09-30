import java.util.*;
public class numberguessinggame {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game");
        int number;
        int tries = 10;
        int c = 0;
        Random random = new Random();
        int unique = random.nextInt(100);
        System.out.println("Computer: I have choosed a number between 1 - 100 ");
        System.out.println("You have "+tries+" tries to guess the number ");
        System.out.println("Start Playing ....");
        while(tries>0)
        {
            System.out.print("Type Your Guess Here : ");
            number = sc.nextInt();
            if(number == unique)
            {
                c = 1;
                break;
            }
            else if(number > unique)
            {
                System.out.println("Too high! Try to guess a lesser number ");
                tries--;
            }
            else
            {
                System.out.println("Too low! Try to guess a higher number ");
                tries--;
            }
        }
        if(c == 1)
        {
            System.out.println("You Guessed Corectly!!!! ");
        }
        else
        {
            System.out.println("Sorry! You are out of Tries");
        }
    }
    
}
