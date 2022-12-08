import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        System.out.println("Задание №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        System.out.println("Задание №2");
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    private static void task3() {
        System.out.println("Задание №3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    private static void task4() {
        System.out.println("Задание №4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }

    private static void task5() {
        System.out.println("Задание №5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру воздуха: ");
        int t = scanner.nextInt();
        System.out.println("Температура воздуха сегодня: " + t +" градусов.");
    }

    private static void task6() {
        System.out.println("Задание №6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какое сегодня число? ");
        int day = scanner.nextInt();
        System.out.print("Какой сейчас номер месяца? ");
        int month = scanner.nextInt();
        System.out.print("Какой сейчас год? ");
        int year = scanner.nextInt();
        System.out.println(day + ":" + month + ":" + year);
    }

    private static void task7() {
        System.out.println("Задание №7");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя пользователя: ");
        String userName = scanner.nextLine();
        System.out.print("Имя помощника: ");
        String assistantName = scanner.nextLine();
        System.out.print("Количество сообщений: ");
        int countMessages = scanner.nextInt();
        System.out.println("Привет," + userName +"! Это твой помощник " + assistantName + "\nУ тебя " + countMessages + " новых писем.");
    }
}