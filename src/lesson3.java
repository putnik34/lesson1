public class lesson3 {
    public static void main(String[] args) {
        int result = formula(2,7,10,5);
        System.out.println(result);


    }

    public static int formula(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
}
