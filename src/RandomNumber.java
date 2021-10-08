import java.util.Random;
import java.util.Scanner;

public class RandomNumber
{
    static void GuessRandumNumber()
    {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int Random_Number;
        boolean correct = false;
        System.out.println("Guess the number 1-10");
        int Guessed_Number = ran.nextInt(10)+1;
        int count = 0;
        while (!correct)
        {
            Random_Number=sc.nextInt();
            count++;
            if(Random_Number==Guessed_Number)
            {
                correct= true;
                System.out.println("Number of tries:"+count);
                System.out.println("Correct");
            }
            else if (Random_Number>Guessed_Number)
            {
                correct = false;
                System.out.println("Too high,try again");
            }
            else
            {
                correct=false;
                System.out.println("Too low,try again");

            }
        }
    }

    public static void main(String[] args)
    {
        GuessRandumNumber();

    }
}
