package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(50);
    }
    void takeUserInput(){
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.printf("You guessed it right, the number is %d and you took %d attempts to solve it.",inputNumber,noOfGuesses);
            return true;
        }
        else if(inputNumber < number){
            System.out.println("Too low...");
        }
        else if(inputNumber > number){
            System.out.println("Too high...");
        }
        return false;
    }
}

public class GussingGame {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
