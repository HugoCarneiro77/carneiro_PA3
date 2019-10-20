import java.util.Scanner;
import java.security.SecureRandom;

public class carneiro_P1 {

    public static void comment(int status)
    {
        SecureRandom rand = new SecureRandom();
        int randComm = rand.nextInt(4);

        if(status == 0) {
            switch (randComm) {
                case 0:
                    System.out.println("No. Please try again.");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don’t give up!");
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    break;
            }
        }
        if(status == 1) {
            switch (randComm) {
                case 0:
                    randComm = 0;
                    System.out.println("Very good!");
                    break;
                case 1:
                    randComm = 1;
                    System.out.println("Excellent!");
                    break;
                case 2:
                    randComm = 2;
                    System.out.println("Nice work!");
                    break;
                case 3:
                    randComm = 3;
                    System.out.println("Keep up the good work!");
                    break;
            }
        }
    }

    public static int multiplication(int digits)
    {
        SecureRandom rand = new SecureRandom();
        Scanner scan = new Scanner(System.in);

        int rand1 = rand.nextInt(digits);
        int rand2 = rand.nextInt(digits);
        int status;
        float answer;

        System.out.printf("How much is %d times %d?\n", rand1, rand2);
        answer = scan.nextFloat();



        if(answer == (rand1 * rand2))
        {
            status = 1;
            comment(status);
            return 1;
        }

        else
        {
            status = 0;
            comment(status);
            return 0;
        }
    }

    public static int addition(int digits)
    {
        SecureRandom rand = new SecureRandom();
        Scanner scan = new Scanner(System.in);

        int rand1 = rand.nextInt(digits);
        int rand2 = rand.nextInt(digits);
        int status;
        float answer;

        System.out.printf("How much is %d plus %d?\n", rand1, rand2);
        answer = scan.nextFloat();



        if(answer == (rand1 + rand2))
        {
            status = 1;
            comment(status);
            return 1;
        }

        else
        {
            status = 0;
            comment(status);
            return 0;
        }
    }

    public static int division(int digits)
    {
        SecureRandom rand = new SecureRandom();
        Scanner scan = new Scanner(System.in);

        float rand1 = rand.nextInt(digits);
        float rand2 = rand.nextInt(digits);

        while(rand2 == 0)
        {
            rand2 = rand.nextInt(digits);
        }

        int status;
        float answer;

        System.out.printf("How much is %.0f divided %.0f?\n", rand1, rand2);
        answer = scan.nextFloat();



        if(answer == (rand1 / rand2))
        {
            status = 1;
            comment(status);
            return 1;
        }

        else
        {
            status = 0;
            comment(status);
            return 0;
        }
    }

    public static int subtraction(int digits)
    {
        SecureRandom rand = new SecureRandom();
        Scanner scan = new Scanner(System.in);

        int rand1 = rand.nextInt(digits);
        int rand2 = rand.nextInt(digits);
        int status;
        float answer;

        System.out.printf("How much is %d minus %d?\n", rand1, rand2);
        answer = scan.nextFloat();



        if(answer == (rand1 - rand2))
        {
            status = 1;
            comment(status);
            return 1;
        }

        else
        {
            status = 0;
            comment(status);
            return 0;
        }
    }

    public static int difLevel()
    {
        int difficulty;
        Scanner scan = new Scanner(System.in);

        System.out.printf("What level of difficulty would you like to play on?\n");
        System.out.printf("Level 1-4, 1 is easiest, 4 is hardest.\n");
        difficulty = scan.nextInt();

        return difficulty;
    }

    public static int problemType()
    {
        int typeProblem;
        Scanner scan = new Scanner(System.in);

        System.out.printf("What type of problem would you like to practice?\n");
        System.out.printf("1 = addition only\n");
        System.out.printf("2 = multiplication only\n");
        System.out.printf("3 = subtraction only\n");
        System.out.printf("4 = division only\n");
        System.out.printf("5 = random mixture\n");
        typeProblem = scan.nextInt();

        return typeProblem;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
	    int i, x = 0, difficulty, typeProblem, random;
	    double countCorrect = 0, countIncorrect,score;


	    System.out.printf("Welcome to the CAI Program!\n");

	    while(x != 1)
        {
            difficulty = difLevel();
            typeProblem = problemType();

            for(i = 0; i < 10; i++)
            {
                if(typeProblem == 1)
                {
                    if(difficulty == 1)
                        countCorrect += addition(10);
                    else if(difficulty == 2)
                        countCorrect += addition(100);
                    else if(difficulty == 3)
                        countCorrect += addition(1000);
                    else if(difficulty == 4)
                        countCorrect += addition(10000);
                }
                else if(typeProblem == 2) {
                    if(difficulty == 1)
                        countCorrect += multiplication(10);
                    else if(difficulty == 2)
                        countCorrect += multiplication(100);
                    else if(difficulty == 3)
                        countCorrect += multiplication(1000);
                    else if(difficulty == 4)
                        countCorrect += multiplication(10000);
                }
                else if(typeProblem == 3) {
                    if(difficulty == 1)
                        countCorrect += subtraction(10);
                    else if(difficulty == 2)
                        countCorrect += subtraction(100);
                    else if(difficulty == 3)
                        countCorrect += subtraction(1000);
                    else if(difficulty == 4)
                        countCorrect += subtraction(10000);
                }
                else if(typeProblem == 4) {
                    if(difficulty == 1)
                        countCorrect += division(10);
                    else if(difficulty == 2)
                        countCorrect += division(100);
                    else if(difficulty == 3)
                        countCorrect += division(1000);
                    else if(difficulty == 4)
                        countCorrect += division(10000);
                }
                else if(typeProblem == 5)
                {
                    random = rand.nextInt(4);
                    if(random == 0)
                    {
                        if(difficulty == 1)
                            countCorrect += addition(10);
                        else if(difficulty == 2)
                            countCorrect += addition(100);
                        else if(difficulty == 3)
                            countCorrect += addition(1000);
                        else if(difficulty == 4)
                            countCorrect += addition(10000);
                    }
                    if(random == 1)
                    {
                        if(difficulty == 1)
                            countCorrect += multiplication(10);
                        else if(difficulty == 2)
                            countCorrect += multiplication(100);
                        else if(difficulty == 3)
                            countCorrect += multiplication(1000);
                        else if(difficulty == 4)
                            countCorrect += multiplication(10000);
                    }
                    if(random == 2)
                    {
                        if(difficulty == 1)
                            countCorrect += subtraction(10);
                        else if(difficulty == 2)
                            countCorrect += subtraction(100);
                        else if(difficulty == 3)
                            countCorrect += subtraction(1000);
                        else if(difficulty == 4)
                            countCorrect += subtraction(10000);
                    }
                    if(random == 3)
                    {
                        if (difficulty == 1)
                            countCorrect += division(10);
                        else if (difficulty == 2)
                            countCorrect += division(100);
                        else if (difficulty == 3)
                            countCorrect += division(1000);
                        else if (difficulty == 4)
                            countCorrect += division(10000);
                    }
                }

            }

            score = countCorrect / 10;

            countIncorrect = 10 - countCorrect;

            System.out.printf("Correct responses = %.0f, Incorrect responses = %.0f, Score = %.2f\n", countCorrect, countIncorrect, score);

            if(score >= .75)
            {
                System.out.printf("Congratulations, you are ready to go to the next level!\n");
                System.out.printf("Would you like to play again?\n");
                System.out.printf("1 to exit; other number to play again\n");
                x = scan.nextInt();
            }
            else
            {
                System.out.printf("Please ask your teacher for extra help.\n");
                System.out.printf("Would you like to play again?\n");
                System.out.printf("1 to exit; other number to play again\n");
                x = scan.nextInt();
            }
            countCorrect = 0;
        }
    }
}
