package pl.isa.homeworks.zadanie1;

import pl.isa.homeworks.zadanie1.GuessNumberGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberApp {
    public static void main(String[] args) {
        GuessNumberGame game = new GuessNumberGame();
        Scanner input = new Scanner(System.in);

        System.out.println(game.getIntro());
        game.getValues();
        while (game.isRunning()) {

            System.out.println(game.getInstruction());
            boolean correctChar = true;

            int number = 0;
            while (correctChar) {
                try {
                    number = input.nextInt();
                    correctChar = false;
                } catch (InputMismatchException a) {
                    input.nextLine();
                    System.out.println("Your input is not an integer number!");
                }
            }


            System.out.println(game.guessNumber(number));

        }
    }
}
