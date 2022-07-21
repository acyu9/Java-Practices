public class ForEachLoop {
    public static void main(String[] args) {
        String foods[] = {"egg", "chocolate", "dumpling", "ramen"};
        food(foods);
    }

    public static void food(String[] foods) {
        System.out.println("Display an array using for-each loop.");
        for (String i : foods) {
            System.out.println(i + " - yum!");
        }
    }
}
