package ru_rtk_java.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String s = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите второе слово: ");
        String t = scanner2.nextLine();
//        String s = "Бейсбол", t = "бобслей";
        if(s.length() != t.length()){
            System.out.println(false);
        }
        char[] chs1 = s.toLowerCase().toCharArray();
        char[] chs2 = t.toLowerCase().toCharArray();
        Arrays.sort(chs1);
        Arrays.sort(chs2);
        String s1 = new String(chs1);
        String t1 = new String(chs2);
        if(s1.equals(t1)){
            System.out.println("Слова:" + s + " и "+t+" являются анаграммами");
        }
    }
}
