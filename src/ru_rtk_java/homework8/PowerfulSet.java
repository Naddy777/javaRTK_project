package ru_rtk_java.homework8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PowerfulSet {

   public static Set union ( Set<Integer> set1, Set<Integer> set2 ){
       Set<Integer> result = new HashSet<>(set1);
       result.addAll(set2);
       return result;
   }
    public static Set intersection ( Set<Integer> set1, Set<Integer> set2 ){
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
    public static Set difference ( Set<Integer> set1, Set<Integer> set2 ){
        Set<Integer> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
    public static void main(String[] args) {
       Set<Integer> set1 = new HashSet<>(List.of(1, 2,3));
       Set<Integer> set2 = new HashSet<>(List.of(0, 1, 2,4));

        System.out.println("Получаем значения при объединении: " + union(set1, set2));
        System.out.println("Получаем значения при пересечении: " + intersection( set1, set2));
        System.out.println("Получаем значения при вычитании из set1 set2: " + difference( set1, set2));
    }
}
