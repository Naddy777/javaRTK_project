package ru_rtk_java.homework8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {
    public static <T> Set <T> getUniqueElements(ArrayList<T> list){
        return new HashSet<>(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20,10,40));
        Set<Integer> unicValues = getUniqueElements(numbers);
        System.out.println("Мы получили уникальные значения чисел: " + unicValues);
        ArrayList<String> strings = new ArrayList<>(List.of("небо", "солнце","звезды","луна", "луна"));
        Set<String> unicString = getUniqueElements(strings);
        System.out.println("Мы получили уникальные значения строк: " + unicString);
    }
}
