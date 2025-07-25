package ru_rtk_java.homework4;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Telewisor telewisor1 = new Telewisor("LG",  60,"есть",50_000);
        telewisor1.SetTV();
        Telewisor telewisor2 = new Telewisor("Sony",  120,"есть",200_000);
        telewisor2.SetTV();
        Telewisor telewisor3 = new Telewisor("Samsung",  120,"есть",100_000);
        telewisor3.SetTV();
        Telewisor telewisor5 = new Telewisor("Российский аналог",  60,"нет",100_000);
        telewisor5.SetTV();

        Scanner scanner = new Scanner(System.in);// создаем телевизор через ввод с клавиатуры
        System.out.print("Введите модель телевизора: ");
        String model1 = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите частоту обновления: ");
        int refreshRate1 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите наличие smartTV: есть/нет: ");
        String smartTV1 = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Введите цену телевизора: ");
        int price1 = scanner4.nextInt();

        Telewisor telewisor6 = new Telewisor(model1,  refreshRate1, smartTV1, price1);
        telewisor6.SetTV();
    }
}
