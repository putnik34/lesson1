public class lesson8 {
    public static void main(String[] args) {
        leapyear(400);
    }
    public static void leapyear ( int number){
        if (number % 4 == 0 && number % 100!= 0) {
            System.out.println("Високосный год");
        }
        if (number % 400 == 0){
            System.out.println("Високосный год");
        }
        else {
            System.out.println("Простой год");
        }

    }
}
