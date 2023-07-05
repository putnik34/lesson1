package homework2;

import java.util.Arrays;

public class lesson4 {
    public static void main(String[] args) {
        int [][] array = new int[4][4];
        for (int i = 0; i < array.length; i++){
            array[i][i] = 1;
            array[i][(array.length - 1) - i] = 1;
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
