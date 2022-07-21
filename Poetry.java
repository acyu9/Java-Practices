import java.util.Scanner;

public class Poetry {
    public static void main(String[] args) {
        makePoem();
        System.out.println("\n");
        guessLimerick();
    }

    public static void makePoem() {
        // Direction for user
        System.out.println("Direction: Enter a poem one line at a time. Type 'quit' to exit");
        
        // Initialize string variables
        String input = "";
        String output = "";
        
        // Create instance of class Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask for user input then check if "quit" is typed to stop the input
        while (!input.equals("quit")) {
            input = scanner.nextLine();
            if (input.equals("quit")) 
                break;
            output = output + "\n" + input;
        }

        // Print the poem
        System.out.println(output);
    }

    public static void guessLimerick() {
        // Create limerick
        String limerick = "Limerick: " + "\n" + "In pizza tech, changes abount." + "\n"
        + "The progress they serve is profound." + "\n" + "I'd say it's a miracle to make the box spherical,"
        + "\n" + "a box that is totally...";

        // Print limerick and user direction
        System.out.println(limerick);
        System.out.println("\n");
        System.out.println("Direction: guess the missing word in lowercase.");

        // Create instance of Scanner and initialize string variable
        Scanner scanner = new Scanner(System.in);
        String input = "";

        // Check user input for the missing word, "round"
        while (!input.equals("round")) {
            input = scanner.next().toLowerCase();

            // If user guesses the word, update and print the limerick
            if (input.equals("round")) {
                System.out.println("\n" + "Congratulations!");
                limerick = limerick.replace("...", " round.");
                System.out.println(limerick);
                break;
            }

            System.out.println("Please try again.");
        }
    }
}

/*
 * Output:
 * Direction: Enter a poem one line at a time. Type 'quit' to exit
From time to time
The clouds give rest
To the moon-beholders.
quit

From time to time
The clouds give rest
To the moon-beholders.


Limerick:
In pizza tech, changes abount.
The progress they serve is profound.
I'd say it's a miracle to make the box spherical,
a box that is totally...

Direction: guess the missing word in lowercase.
hello
Please try again.
world
Please try again.
round

Congratulations!
Limerick:
In pizza tech, changes abount.
The progress they serve is profound.
I'd say it's a miracle to make the box spherical,
a box that is totally round.
*/
