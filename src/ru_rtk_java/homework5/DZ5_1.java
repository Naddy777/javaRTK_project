package ru_rtk_java.homework5;
import java.util.Scanner;
/*Задача 1. Для введенной с клавиатуры буквы английского алфавита
нужно вывести слева стоящую букву на стандартной клавиатуре. При этом
клавиатура замкнута, т.е. справа от буквы «p» стоит буква «a», а слева от "а"
буква "р", также соседними считаются буквы «l» и буква «z», а буква «m» с
буквой «q».
Входные данные: строка входного потока содержит один символ —
маленькую букву английского алфавита.
Выходные данные: следует вывести букву стоящую слева от заданной
буквы, с учетом замкнутости клавиатуры
 */
public class DZ5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Сканер
        System.out.println("Введите символ английского алфавита: ");
        String simvol = scanner.nextLine();
        char letter= simvol.charAt(0);// берем из введенной строки первый символ
        System.out.println("Введенная буква: "+letter);
        String klaviatura="qwertyuiopasdfghjklzxcvbnm";
       // System.out.println("Длина абракадабры: " + klaviatura.length());
        int index = klaviatura.indexOf(letter);// определяем индекс введенного символа  в стринге klaviatura
        System.out.println("Индекс введенной буквы: "+index);
        if (index ==-1){// вводим для того, чтобы отразить символ вне списка (работает по типу - надо вывести сообщение об ошибке, поэтому делаем проверку
            // на тот индекс, который вне списка. Если он в списке, то ошибка не выводится)
            System.out.println("Ошибка! Не тот символ ");
        }else {
           int leftIndex=(index-1+klaviatura.length()) % klaviatura.length();// остаток от деления нужен чтобы зациклить klaviatura и
            // чтобы индекс не вываливался за пределы списка
            //int leftIndex=(index-1);// так не работает для q, не зацикливает klaviatura
           // int leftIndex=(index-1+klaviatura.length()); // так работает для q, но не работает для остальных
            // букв (они выпадают за пределы списка по индексам, если прибавлять длину списка)
            char leftSymbol=klaviatura.charAt(leftIndex);
            System.out.println("Буква слева на клавиатуре: " + leftSymbol);
        }
    }
}
