
package pl.isa.homeworks.zadanie1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessNumberGame {
    double x = Math.random();
    //declaring double x which take random number beetween <0;1)
    //modifing value of our random number so it is between <0;100)
    int i = 0;
    int j = 0;
    //number of tries
    String b; // guessnumber output
    String c; //getinstructions output
    boolean isRunning = true; // condition if program should still run.
    int dolnyPrzedzial;
    int gornyPrzedzial;
    int k; // number of tries

    boolean lowerLowerThanUpper = false; // condition if lower limit is lowet than upper limit
    boolean veryImportantCondition1 = true; // if input is not an integer
    boolean veryImportantCondition2 = true; // if input is not an integer
    boolean veryImportantCondition3 = true; // if input is not an integer
    Scanner dolnyPrzedzial1 = new Scanner(System.in);
    Scanner gornyPrzedzial1 = new Scanner(System.in);
    Scanner numTries = new Scanner(System.in);
    public String getIntro() {
        String L = "Welcome to GUESS THE NUMBER game! Choose lower and upper limit of range. THen choose your number of tries. Program will automatically generate number " +
                " from your range. Try to guess it!";
        return L;
    }
    public void getValues() {
        while (veryImportantCondition1) {
            try {
                System.out.println("Enter lower limit of the range:");
                dolnyPrzedzial = dolnyPrzedzial1.nextInt();
                veryImportantCondition1 = false;
            } catch (InputMismatchException a) {
                dolnyPrzedzial1.nextLine();
                System.out.println("Your input is not an integer number!");
            }
        }
        while (veryImportantCondition2) {
            try {
                System.out.println("Enter upper limit of the range:");

                while (!lowerLowerThanUpper) {
                    gornyPrzedzial = gornyPrzedzial1.nextInt();
                    if (gornyPrzedzial > dolnyPrzedzial) {
                        break;
                    } else {
                        System.out.println("You must choose upper limit that is higher than lower limit! Try again:");
                    }

                }
                veryImportantCondition2 = false;
            } catch (InputMismatchException a){
                gornyPrzedzial1.nextLine();
                System.out.println("Your input is not an integer number!");
            }
        }
        while (veryImportantCondition3){

            try {
                System.out.println("Enter maximum number of tries:");

                k = numTries.nextInt();
                veryImportantCondition3 = false;


            }
            catch (InputMismatchException a) {
                numTries.nextLine();
                System.out.println("Your input is not an integer number!");
            }
            }
        }

    public boolean isRunning() {
        if (j == k) {
            isRunning = false;
            System.out.println( " Game over");
        } else {
            j++;
        }
        return isRunning;
    }


    public String getInstruction() {

           c = ("You have " + (k - i) + " tries left Remember that You're guessing number between " + dolnyPrzedzial + " and " + gornyPrzedzial);

        return c;
    }

    public String guessNumber(int number) {
        int y = (int)((gornyPrzedzial - dolnyPrzedzial)*x + dolnyPrzedzial);
            if (number > y) {
                b = "Wrong! the number is less than " + number;
            } else if (number < y) {
                b = "Wrong! the number is greater than " + number;
            } else {
                isRunning = false;
                b = "Congratulations! You won! you guessed the right number which is : " + y;
            }
            i++;
            return b;
        }
    }



