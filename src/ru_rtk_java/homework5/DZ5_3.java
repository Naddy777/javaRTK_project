package ru_rtk_java.homework5;

import java.util.Arrays;
import java.util.Scanner;

/*
Задача 3*. Задана строка, состоящая из букв английского алфавита,
разделенных одним пробелом. Необходимо каждую последовательность
символов упорядочить по возрастанию и вывести слова в нижнем регистре.
Входные данные: в единственной строке последовательность символов
представляющее два слова.
Выходные данные: упорядоченные по возрастанию буквы в нижнем
регистре.
 */
public class DZ5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Сканер
        System.out.println("Введите два слова через пробел: ");
        String liniya = scanner.nextLine();
        System.out.println("Введенная строка: " + liniya);
        String lowerLinya = liniya.toLowerCase();// переводим в нижний регистр
        System.out.println("Все в нижнем регистре: " + lowerLinya);
        String[] words=lowerLinya.split(" ");// делаем массив, сплитуем по пробелу
        if (words.length!=2){
            System.out.println("Ошибка! Условие не выполнено! ");
            scanner.close();
            return;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println("Текущее слово перед сортировкой: " + word);
            char[] chars = word.toCharArray();// перекладываем в массив символов
            Arrays.sort(chars);//сортируем массив символов
            String sortedWord = new String(chars);// собираем из отсортированных символов новый стринг chars
            System.out.println("Отсортированное слово: " + sortedWord);
            result.append(sortedWord);
            if (i < words.length - 1) {
                result.append(" ");// мы добавляем в конце нового слова пробел (к результату добавить пробел)
            }
        }
        System.out.println("Резльтат: " + result.toString());
        scanner.close();
    }
}

//
//        public static void main(String[] args) {
//            Scanner scanner= new Scanner(System.in);
//            System.out.println("Введите два слова через пробел:");
//            String line=scanner.nextLine();
//            System.out.println("Введенная строка: "+line);
//            String lowerLine=line.toLowerCase();
//            System.out.println("Нижний регистр: "+lowerLine);
//            String[] words=lowerLine.split(" ");
//            if(words.length!=2){
//                System.out.println("Ошибка, требуется ввести ровно два слова");
//                scanner.close();
//                return;
//            }
//            StringBuilder result= new StringBuilder();
//            for (int i=0;i< words.length;i++){
//                String word=words[i];
//                System.out.println("Текущее слово перед сортировкой: "+word);
//                char[] chars=word.toCharArray();
//                Arrays.sort(chars);
//                String sortedWord=new String(chars);
//                System.out.println("Отсортированное слово: "+sortedWord);
//                result.append(sortedWord);
//                if(i<words.length-1) {
//                    result.append(" ");
//                }
//            }
//            System.out.println("Резльтат: "+result.toString());
//            scanner.close();
//        }
//}
