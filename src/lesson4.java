import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое число");
        int a = scanner.nextInt();
        System.out.println("Второе число");
        int b = scanner.nextInt();
        System.out.println(contrast(a, b));
        scanner.close();
    }
    public static boolean contrast(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }
        else {
            return false;
        }
    }
}
