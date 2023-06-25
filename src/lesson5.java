import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        sign(a);
        scanner.close();

    }

    public static void sign (int a){
        if (a < 0){
            System.out.println("Отрицательное число");
        }
        else {
            System.out.println("Положительное число");
        }
    }


}
