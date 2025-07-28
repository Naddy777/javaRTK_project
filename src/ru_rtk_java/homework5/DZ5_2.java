package ru_rtk_java.homework5;

import java.util.Scanner;

/*
Задача 2. Задана последовательность, состоящая только из символов ‘>’,
‘<’ и ‘-‘. Требуется найти количество стрел, которые спрятаны в этой
последовательности. Стрелы – это подстроки вида ‘>>-->’ и ‘<--<<’.
Входные данные: в первой строке входного потока записана строка,
состоящая из символов ‘>’, ‘<’ и ‘-‘ (без пробелов). Строка может содержать до
106 символов.
Выходные данные: в единственную строку выходного потока нужно
вывести искомое количество стрелок
 */
public class DZ5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Сканер
        System.out.println("Введите строку из символов: '<', '>' и '-': ");
        String cepochka = scanner.nextLine();
        int dlina=cepochka.length();
        System.out.println("Длина строки: " + dlina);
        int count=0;
        for(int i=0;i<=dlina-5;i++){
            String sub=cepochka.substring(i, i+5);// здесь можно поменять параметры счетчика и двигать окно проверки на 1, а не на 5
            System.out.println("Проверяем позицию: " + i+ sub);
            if(sub.equals(">>-->")||sub.equals("<--<<")){
                count++;
                System.out.println("Найдена стрелка! Количество: " + count);
            }
        }System.out.println("Всего стрелок: " + count);
        scanner.close();


    }
}
