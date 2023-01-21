import java.util.Scanner;
import java.util.Random;
class Game {
    int inputNumber;
    int number;
    int noOfGuess = 0;

    public int getNoOfGuess() {
        return noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        noOfGuess++;
        if (inputNumber==number){
            System.out.format("Congratulations!! You guess it right , it was %d \nYou guesses it in %d attempts", number,noOfGuess);
            System.out.println("\nThanks you for playing.....!!!");
            return true;
        } else if (inputNumber<number) {
            System.out.println(inputNumber + " is Too....low!!!");
        }
        else if (inputNumber>number) {
            System.out.println(inputNumber + " is Too....High!!!");
        }
        return false;
    }

    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}



