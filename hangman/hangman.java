package hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class hangman {
    public static String word;
    public static int count;
    public static ArrayList<String> guess = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Input the word yoo want players to guess. Any word after space will be removed!: ");
        Scanner parola = new Scanner(System.in);
        word = parola.next();
        System.out.println("\n\n\nLet's begin!");


        count = 0;
        for (int i = 0; i < 7; i++)
        {
            System.out.println("Guess the letter: ");
            System.out.println("You have : " + (7 - i) + " tries left!");
            Scanner indov = new Scanner(System.in);
            guess.add(String.valueOf(indov.next().charAt(0)));
            String result = String.join("", guess);

            if (result.charAt(count) == word.charAt(count))
            {
                System.out.println("right choice!");
                System.out.println("The guessed results so far: " + guess);
                count++;
                i--;
            }
            else {
                guess.remove(count);
                System.out.println(result.charAt(count) + " was wrong! try again!");
                drawer.drawImage(i);
                System.out.println("The guessed results so far: " + guess);

            }
            if (result.equals(word)){
                System.out.println("You've won! The word was: " + word);
                break;
            }
        }
    }
}