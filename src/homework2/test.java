package homework2;

import java.util.Arrays;

public class test {



    public static void main(String[] args) {
        int[] arrays = { 1, 2, 3, 4, 5 };
        int[] arrays1 = { 1, 2, 3, 4, 5 };
        int[] arrays2 = { 1, 2, 3, 4, 5 };

        var executeTask = new Test();

        var result = executeTask.execute(arrays, 2);
        var result1 = executeTask.execute(arrays1, -2);
        var result2 = executeTask.execute(arrays2, arrays.length + 1);

        assert Arrays.equals(result, new int[]{ 3, 1, 2, 4, 5 });
        assert Arrays.equals(result1, new int[]{ 3, 4, 5, 1, 2 });
        assert Arrays.equals(result2, new int[] { 5, 1, 2, 3, 4 });

        System.nanoTime();
    }

    public static class Test {
        public int[] execute(int[] array, int n) {
            var length = array.length;
            var skiff = n;
            if (n < 0) {
                skiff = length + n;
            }
            if (n > array.length) {
                skiff = n % array.length;
            }

            for (int j = 0; j < skiff; j++) {
                for (int i = length - 1; i > 0; i--) {
                    swap(array, i, i - 1);
                }
            }

            return array;
        }

        private void swap(int[] array, int left, int right) {
            int temp = array[right];
            array[right] = array[left];
            array[left] = temp;
        }
    }
}
