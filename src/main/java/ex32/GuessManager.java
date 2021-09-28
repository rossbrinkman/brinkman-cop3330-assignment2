package ex32;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessManager {
    private int guess = 0;
    private int guesses = 0;

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public void ReadGuess()
    {
        Scanner scanner = new Scanner(System.in);

        int input;
        while (true) {
            try {
                input = (int)scanner.nextFloat();
                setGuesses(getGuesses()+1);
                break;
            } catch (InputMismatchException ime) {
                PrintError("a number ");
                scanner.next();
                setGuesses(getGuesses()+1);
            }
        }
        setGuess(input);
    }

    public void PrintError(String type)
    {
        System.out.printf("Invalid input, must be %s: ", type);
    }
}
