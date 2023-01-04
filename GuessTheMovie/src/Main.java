import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int startingPoints = 10;
        String hiddenTitle = ""; //use this String to cover title by "_"
        String rightLetters = ""; //contain corretly guessed letters
        String wrongLetters = ""; //contain wrongly guessed letters

        //use method from Game.java to get random movie title
        Game random = new Game();
        String randomTitle = random.getRandomTitle(random.file).toLowerCase();
        System.out.println("Random line : " + randomTitle);
        //hide the full title name by "_"
        String coveredTitle = randomTitle.replaceAll("[a-z]", "_");
        System.out.println("You are guessing: " + coveredTitle);

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have guessed ("+wrongLetters.replace(" ", "").length()+") wrong letters: "+wrongLetters);
            String guess = scanner.nextLine().toLowerCase();
            char guessToChar = guess.charAt(0);

            //check if letter matches alphabet letters
            if (!(guess.matches("[a-z]"))) {
                System.out.println("Only letter!");
                i++;
            }
            //check if letter has been already typed
            else if(rightLetters.contains(guess) || wrongLetters.contains(guess)) {
                System.out.println("You already typed this letter");
                i++;
            }
            //if letter is correct add it to rightLetters
            else if(randomTitle.contains(guess)) {
                rightLetters += guessToChar +" ";
                i++;
            }
            //if is not add to wrongLetter and substract 1 point
            else  {
                wrongLetters += guessToChar +" ";
                startingPoints--;
            }
            //if rightLetters is empty yet replace all letters in title movies by "_"
            if (rightLetters.equals("")) {
                System.out.println(randomTitle.replaceAll("[a-z]", "_"));
            }
            //if rightLetters is not empty replace all letter excluding right guessed letters
            else {
                hiddenTitle = randomTitle.replaceAll("[a-z&&[^" + rightLetters + " ]]", "_");
                System.out.println(hiddenTitle);
            }
            //if guess 10 wrong letters then game over
            if(startingPoints==0){
                System.out.println("You have guessed (10) wrong letters :" + wrongLetters);
                System.out.println("You lost. The correct movie title is '" + randomTitle + "' .");
                break;
            }
            //if all letters guessed then win
            if (!hiddenTitle.contains("_") && !(hiddenTitle.equals(" "))) {
                System.out.println("Congratulations! You guessed the movie title corectly" );
                break;
            }
        }
    }
}


