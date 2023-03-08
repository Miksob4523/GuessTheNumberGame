
package pl.isa.homeworks.zadanie1;
import java.util.Scanner;

public class GuessNumberGame {
    double x = Math.random();
    //declaring double x which take random number beetween <0;1)
    int y = (int)(100*x + 1);
    //modifing value of our random number so it is between <0;100)
    int i = 0;
    int j = 0;
    //number of tries
    String b;
    String c;
    boolean isRunning = true;
    public String getIntro() {
        String L = "I have randomly chosen number between [1,100]." +
                " Try to guess it.";
        return L;
    }

    public boolean isRunning() {
        if (j == 10) {
            isRunning = false;
            System.out.println( " Game over");
        } else {
            j++;
        }
        return isRunning;
    }


    public String getInstruction() {

           c = ("You have " + (10 - i) + " tries left");

        return c;
    }

    public String guessNumber(int number) {
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



