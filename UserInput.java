import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
        //create an instance/object of the scanner class. system.in means input from terminal window
        Scanner input = new Scanner(System.in);
        
        //user input. scanner.next means reads the string (1 word)
        String first_question = "Enter your first name: ";
        System.out.print(first_question);
        String first = input.next();
        
        String second_question = "Enter your last name: ";
        System.out.print(second_question);
        String last = input.next();

        System.out.println("Suggested usernames: ");
        System.out.println(first + last);
        System.out.println(last + first);
        System.out.println(first + " " + last);
        System.out.println(first + "-" + last);
    }

}
