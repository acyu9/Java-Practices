public class TraditionalLoop {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        forEachDisplay(array);
    }

    public static void forEachDisplay(int [] data) {
        System.out.println("Increments each value in array by 1.");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + 1 + " ");
        }
    }
}
