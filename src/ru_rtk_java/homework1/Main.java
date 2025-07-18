package ru_rtk_java.homework1;
import java.util.Scanner;
//позволяет считывать данные с клавиатуры
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); // Создаем объект Сканер
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine(); //Считываем введенную строку. String - это строка, nextLine - считываем строку.
        System.out.println("Привет, " + name +"! Рад Вас видеть!"); // Приветствуем пользователя
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите число: ");// Просим пользователя ввести число
        int number = scanner2.nextInt(); //Int - простое число, nextInt - считываем число.
        System.out.println("Ваше число: " + number +"! ");

    }

}
