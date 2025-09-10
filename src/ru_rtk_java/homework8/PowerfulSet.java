package ru_rtk_java.homework8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerfulSet {

   public static <T>Set <T> union ( Set<T> set1, Set<T> set2 ){
       Set<T> result = new HashSet<>(set1);
       result.addAll(set2);
       return result;
   }
    public static <T>Set intersection ( Set<T> set1, Set<T> set2 ){
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
    public static <T>Set difference ( Set<T> set1, Set<T> set2 ){
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
    public static void main(String[] args) {
       Set<Integer> set1 = new HashSet<>(List.of(1, 2,3));
       Set<Integer> set2 = new HashSet<>(List.of(0, 1, 2,4));

        System.out.println("Получаем значения при объединении чисел: " + union(set1, set2));
        System.out.println("Получаем значения при пересечении чисел: " + intersection( set1, set2));
        System.out.println("Получаем значения при вычитании чисел из set1 set2: " + difference( set1, set2));

        Set<String> set3 = new HashSet<>(List.of("небо", "солнце","звезды","луна", "луна"));
        Set<String> set4 = new HashSet<>(List.of("небо", "звезды","луна", "горизонт"));

        System.out.println("Получаем значения при объединении строк: " + union(set3, set4));
        System.out.println("Получаем значения при пересечении строк: " + intersection( set3, set4));
        System.out.println("Получаем значения при вычитании строк из set3 set4: " + difference( set3, set4));
    }
}
