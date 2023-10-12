import java.util.Scanner;
import java.util.Random;

public class guessno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "yes";

        while (play.equals("yes"))
         {
            Random random = new Random();
            int number = random.nextInt(100)+1;

            int guess = -1;
            int numberOfChances = 0;

            while (guess != number)
             {
                System.out.print("ENTER A NUMBER BETWEEN 1 AND 100:");
                guess = sc.nextInt();
                numberOfChances++;

                if (guess == number) 
                {
                    System.out.println("YOU GUESSED THE RIGHT NUMBER!");
                    System.out.println("------------------------------");

                    System.out.println("THE NUMBER OF TRIES: " + numberOfChances);

                    System.out.println("----------------------------------------");

                    System.out.print("DO YOU WANT TO PLAY AGAIN? YES OR NO");

                    System.out.println("------------------------------------");
                    sc.nextLine(); 
                    play = sc.nextLine().toLowerCase();
                } 
                else if (guess > number)
                 {
                    System.out.println("THE GUESSED NUMBER IS TOO HIGH TRY AGAIN");
                } 
                else 
                {
                    System.out.println("THE GUESSED NUMBER IS TOO LOW TRY AGAIN");
                }
            }
        }
        sc.close();
    }
}

