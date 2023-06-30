package homework2;

public class lesson5 {
    public static void main(String[] args) {
    int [] array = {9, 2, 3, 5, 7, 11, 4, 23, 15};
    int min = array[0];
    int max = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}
