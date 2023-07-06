package homework3;

import java.util.Random;
import java.util.Scanner;

// 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
public class lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random numbers = new Random();
        int try3 = 0;
        int random = numbers.nextInt(10);
        System.out.print("Угадай число с трех раз,");

        while (try3 < 3) {
            System.out.print("Введите число от 0 до 9: ");
            int number = scanner.nextInt();

            if (number > random) {
                System.out.println("Слишком много! Загаданное число меньше:");
                System.out.println();
            } else if (number < random) {
                System.out.println("Слишком мало! Загаданное число больше:");
                System.out.println();
            } else {
                System.out.println("Ты отгадал!");
                System.out.println();
                break;
            }
            try3++;
        }
        System.out.print("Повторить игру еще раз? 1 – да / 0 – нет: ");

        String userData = scanner.next();
        if (userData.equals("1")) {
            main(null);
        }
    }
}
