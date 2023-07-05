package homework2;

public class lesson6 {
    public static void main(String[] args) {
        System.out.println(checkBalance(new int[] {1, 2, 1, 1, 0, 4, 9}));
    }
        private static boolean checkBalance(int[] array) {
            System.out.println();
            int right = 0;
            int left = 0;
            for(int i = 0; i < array.length - 1; i++) {
                left += array[i];
                for (int j = i + 1; j < array.length; j++) {
                    right += array[j];
                }
                if (left == right) {
                    return  true;
                }
                else right = 0;
            }
            return  false;
        }


}
