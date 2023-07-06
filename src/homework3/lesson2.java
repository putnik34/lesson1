package homework3;

import java.util.Random;
import java.util.Scanner;

public class lesson2 {
    //2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
    // "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
    // "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
    // Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    public static final int FAKE = 15;
    public static final String[] WORDS = new String[]{
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {

        System.out.println("Угадайте слово");

        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        String targetWord = WORDS[index];

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите слово: ");
            String userWord = scanner.nextLine();

            if (targetWord.equals(userWord)) {
                System.out.println("Все верно!");
                break;
            }

            System.out.println("Не верно!");
            printPrompt(targetWord, userWord);
            System.out.println();
        } while (true);

        System.out.println("Игра окончена!");
    }

    private static void printPrompt(String targetWord, String userWord) {
        for (int i = 0; i < FAKE; i++) {
            char chr = '#';
            if (i < userWord.length() && i < targetWord.length() && userWord.charAt(i) == targetWord.charAt(i)) {
                chr = userWord.charAt(i);
            }
            System.out.print(chr);
        }
    }
}


