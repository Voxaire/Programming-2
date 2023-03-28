package Challenge.C4;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuess = 0;
    public int getnoOfGuess() {
        return noOfGuess;
    }
    public void setNoOfGuess() {
        this.noOfGuess = noOfGuess;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.print("Guess the Number: ");
        Scanner scnr = new Scanner(System.in);
        inputNumber = scnr.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuess++;
        if (inputNumber == number) {
            System.out.format("You guessed it right! It was %d\n You gussed it %d attempts", number, noOfGuess);
            return true;

        } else if (inputNumber < number) {
            System.out.println("Too low.");

        } else if (inputNumber > number ){
        }
        return false;
    }
}

public class C4{
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
