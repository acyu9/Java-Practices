import java.util.Scanner;

public class TextBasedGame2 {
    public static void main(String[] args) {
        TextBasedGame game = new TextBasedGame();
        game.input();
    }
}

class TextBasedGame {
    public void intro() {
        System.out.println("You are standing in an open field west of a white house, with a boarded front door."
        + "There is a small mailbox here.");
    }

    public void help() {
        System.out.println("Type in one of the following from the list of commands:\n"
        + "about\n" + "help\n" + "open\n" + "search\n" + "quit");
    }

    public void open(String item) {
        System.out.println(item + " is open.");
    }

    public void search(String location) {
        System.out.println("You search the " + location + " and find a chest!");
    }

    public void quit() {
        //function returns void, so can't return any value
        return;
    }

    public void input() {
        //create an instance of the Scanner class
        Scanner user_input = new Scanner(System.in);
        
        //ask for user input and store in the response variable
        System.out.println("Type a command:");
        String response = user_input.next().toLowerCase();

        //match user input to different methods
        if (response.equals("about")) {
            intro();
        }
        else if (response.equals("help")) {
            help();
        }
        else if (response.equals("open")) {
            System.out.println("Choose an item to open.");
            String item = user_input.next();
            open(item);
        }
        else if (response.equals("search")) {
            System.out.println("Choose a location to search.");
            String location = user_input.next();
            search(location);
        }
        else if (response.equals("quit")) {
            quit();
        }
    }
}

/*Output:
Type a command:
about
You are standing in an open field west of a white house, with a boarded front door.There is a small mailbox here.
 * 
Type a command:
help
Type in one of the following from the list of commands:
about
help
open
search
quit
*
Type a command:
open
Choose an item to open.
door
door is open.
*
Type a command:
search
Choose a location to search.
field
You search the field and find a chest!
*
Type a command:
quit
 */