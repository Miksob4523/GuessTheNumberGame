
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
    public String getIntro() {
        String L = "Welcome to GUESS THE NUMBER game! Choose lower and upper limit of range. THen choose your number of tries. Program will automatically generate number " +
                " from your range. Try to guess it!";
        return L;
    }
    public void getValues() {
        System.out.println("Enter lower limit of the range:");
        Scanner dolnyPrzedzial1 = new Scanner(System.in);
        dolnyPrzedzial= dolnyPrzedzial1.nextInt();
        System.out.println("Enter upper limit of the range:");
        Scanner gornyPrzedzial1 = new Scanner(System.in);
        gornyPrzedzial = gornyPrzedzial1.nextInt();
        System.out.println("Enter maximum number of tries:");
        Scanner numTries = new Scanner(System.in);
        k = numTries.nextInt();
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



