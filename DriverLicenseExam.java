import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.lang.Math;

public class DriverLicenseExam {
    public static void main(String[] args) throws Exception {
        // Ask for user answers and store in string variable
        Scanner userInput = new Scanner(System.in);
        String[] array = new String[20];
        
        System.out.println("Type your answers here: ");
        for(int i = 0; i < 20; i++) {
            String input = userInput.next().toUpperCase();
            if(!(input.equals("A") || input.equals("B") ||input.equals("C") ||input.equals("D"))) {
                System.out.println("Please enter a valid answer.");
                System.exit(1);
            }
            else {
                array[i] = input;
            }
        }

        // Open file
        File file = new File("DMVanswers.txt");

        // Read file
        Scanner answersFile = new Scanner(file);
        answersFile.useDelimiter("\\n");
        int counter = 0;

        while(answersFile.hasNext()) {
            for(int i = 0; i < 20; i++) {
                String answer = answersFile.next();

                if(array[i].equals(answer)) {
                    counter++;
                } 
            }
           
        }
        
        answersFile.close();

        File outFile = new File("report.txt");

        FileWriter writer = new FileWriter(outFile);
        
        double rawScore = counter / 20.0;
        long score = Math.round(rawScore * 100);

        if(score >= 75) {
            writer.write("Congratulations, you passed! You got a score of " + counter + " out of 20, or " + score + "%");
        }

        else {
            writer.write("Please try again next time. Good luck!");
        }
        
        writer.close();
    }
}


// read the file
// go through the user's input
// compare each input to file read, add counter if correct
// output in txt