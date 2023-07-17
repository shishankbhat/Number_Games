// Generate a random number within a specified range, such as 1 to 100.
// 2. Prompt the user to enter their guess for the generated number.
// 3. Compare the user's guess with the generated number and provide feedback on whether the guess
// is correct, too high, or too low.
// 4. Repeat steps 2 and 3 until the user guesses the correct number.
// You can incorporate additional details as follows:
// 5. Limit the number of attempts the user has to guess the number.
// 6. Add the option for multiple rounds, allowing the user to play again.
// 7. Display the user's score, which can be based on the number of attempts taken or rounds won

import java.util.*;

public class numbergame {
    static void guess_number(int num) {
        Scanner input = new Scanner(System.in);
        int j = 1;
        do 
        {
            System.out.println("if u want to play  then press 1 \t for exit press another number");
            int n = input.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter limit the number of attempts the user has to guess the number");
                    int guess_attempt = input.nextInt(); //  number of attempts
                    System.out.println("Now we try to guess the number ");
                    int count = 0, i = 1;
                    while(i <= guess_attempt)
                    {
                        if (i == guess_attempt) {
                            System.out.println("Enter " + i + " guess number It is last , so be careful");
                        } else {
                            System.out.println("Enter " + i + " guess number");
                        }
                        int guess_num = input.nextInt();
                        if (guess_num > num) {
                            System.out.println("Too high try again");
                            count++;
                            i++;
                        }

                        else if (guess_num == num) {
                            count++;
                            System.out.println("User Guess is correct, in " + count + "attempts");
                            break;

                        }

                        else {
                            System.out.println("Too low try again");
                            count++;
                            i++;
                        }
                    }
                    break;
                default:
                    j = 0;
            }
        } while (j > 0);
        System.out.println("Thanks to play");
        input.close();
    }
    public static void main(String[] args) {
        System.out.println("Generate a random number with in specified range like 1 to 100");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter range ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("So range is " + a + " To " + b);
        System.out.print("Enter number for guess to user ");
        for(int i = a; i <=b; i++)
        {
            int num = input.nextInt();
            if (num >= a && num <= b) {
                System.out.println("The Generated number is " + num);
                guess_number(num);
                break;
            } else {
                System.out.println(" Number is not in range try again !");
            }
        }
        input.close();
        
    }
}