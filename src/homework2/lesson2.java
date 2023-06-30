package homework2;

public class lesson2 {
    public static void main(String[] args) {
        int [] array = new int[8];
        for (int i = 0, j = 0; i < array.length && j <= 21; i++, j += 3){
            array[i] = j;
            System.out.println(array[i]);
        }
    }
}
