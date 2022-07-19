import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random random = new Random();

        // nextInt is a random int from 0 to the length of the array
        int r = random.nextInt(fortunes.length);
        System.out.println(fortunes[r]);
    }
    
    static String[] fortunes = {"Look how far you've come.", 
    "The art of life is not controlling what happens to us, but using what happens to us.", 
    "Every new beginning comes from some other beginning's end.", "Ignore previous cookie.",
    "This cookie is never gonna give you up, never gonna let you down."};
}


