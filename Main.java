import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Who are you?");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");

        Random rand = new Random();

        int heads = 0;
        int tails = 0;

        System.out.println("Tossing a coin...");

        for (int i = 1; i <= 3; i++) {

            if (rand.nextBoolean()) {
                System.out.println("Round " + i + ": Heads");
                heads++;
            } else {
                System.out.println("Round " + i + ": Tails");
                tails++;
            }
        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        if (heads > tails) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}