package homework3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    static Scanner scanner = new Scanner(System.in);

    static boolean isEven(int n){ // метод проверяет, является ли число четным
        return n % 2 == 0;
    }

    static void task1(){
        System.out.println("Подсчет суммы нечетных положительных чисел");
        System.out.println("==========================================");
        System.out.println("Введите число (0 - выход из программы): ");

        int sum = 0;
        int counter = 0;
        boolean isNumber = false;
        int number = 0;

        do {
            counter ++; // увеличиваю счетчик
            System.out.println("Введите число");
            isNumber = scanner.hasNextInt();
            if (isNumber){
                number = scanner.nextInt();
                if (number > 0 && !isEven(number)){
                    sum += number;
                }

            }
            else {
                System.out.println("Вы ввели некорректное число, \nпожалуйста, повторите попытку ввода");
                scanner.nextLine();
            }

        }
        while (!(isNumber && number == 0));
        System.out.printf("Сумма нечетных положительных чисел: %d; \nКоличество попыток ввода: %d\n", sum, counter - 1);
        System.out.println("Завершение работы подпрограммы");


    }
    static void task2(){
        System.out.println("Игра Угадайка");
        System.out.println("");
        System.out.println("Введите число (0 - выход из программы): ");

        Random random = new Random();
        int num = random.nextInt(10);
        int counter = 0;
        int number1 = 0;
        boolean isNumber1 = false;

        do {
            counter++;
            System.out.println("Введите число");
            isNumber1 = scanner.hasNextInt();
            if (isNumber1){
                number1 = scanner.nextInt();
            }
            else {
                System.out.println("Вы ввели некорректное число, \nпожалуйста, повторите попытку ввода");
                scanner.nextLine();
            }
            if (number1 < num){
                System.out.println("Загаданное число меньше \nзаданного случайного числа");
            }
            else if (number1 > num){
                System.out.println("Загаданное число больше \nзаданного случайного числа");
            }
            else {
                System.out.println("Загаданное число и заданное \nслучайное число равны");
            }
        }
        while (!(isNumber1 && number1 == 0 || counter >= 3));
        System.out.println("Закончились попытки для прохождения игры");
        boolean flag = true;
        do {
            System.out.println("Запустить игру еще раз? (1 - да, 0 - нет) ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice == 1 || choice == 0) {
                    flag = false;
                    System.out.println("Игра закончена");
                }
                if (choice == 1) task2();
                scanner.nextLine();
            }
            else {
                scanner.nextLine();
            }
        }
        while (flag);
}
    static void task3(){
        System.out.println("No Name");
    }

    public static void main(String[] args) {

        boolean f = true;

        System.out.println("1 - Подсчет суммы нечетных положительных чисел");
        System.out.println("2 - Игра Угадайка");
        System.out.println("3 - No Name");
        System.out.println();
        System.out.println("Введите номер игры (0 - выход из программы): ");

        while (f) {
            if (scanner.hasNextInt()) {
                int no = scanner.nextInt();
                scanner.nextLine();
                switch (no) {
                    case 0:
                        System.out.println("Завершение работы программы");
                        f = false;
                        break;
                    case 1:
                        task1();
                        break;
                    case 2:
                        task2();
                        break;
                    case 3:
                        task3();
                        break;
                    default:
                        System.out.println("Вы ввели некорректное число");
                }
            }
            else {
                System.out.println("Вы ввели некорректное число, \nпожалуйста, повторите попытку ввода");
                scanner.nextLine();
            }
        }
    }

}
