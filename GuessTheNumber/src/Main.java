import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have randomly chosen the number between [1 - 100]");
        System.out.println("Try to guess it");

        Scanner scanner = new Scanner(System.in);
        for(int i = 10; i>0; i--){
            System.out.println("You have guess(es) left: " + i);
            int guess = scanner.nextInt();

            if (randomNumber < guess){
                System.out.println("The number is smaller than: "+guess);
            } else if (randomNumber > guess) {
                System.out.println("The number is greater than: "+guess);
            } else {
                hasWon = true;
                break;
            }
        }
        if (hasWon) {
            System.out.println("Congratulations... you win");
        } else {
            System.out.println("Sorry you lost. Try again");
            System.out.println("The number was: "+randomNumber);
        }

    }

}