package ru_rtk_java.Chernoviki;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
Реализовать метод, который на вход принимает ArrayList<T>, а возвращает набор
уникальных элементов этого массива. Решить, используя коллекции
 */
public class UnicValues {
//    @FunctionalInterface
//    public interface Inter<T>{
//        T func(T value);
//    }
    public static Set unicValuesArrays ( ArrayList<Integer> values ){
        Set<Integer> unicValues = new HashSet<>(values);

//        System.out.println("Уникальные значения: " + unicValues);
        Set result = unicValues;
        return result;

    }
    public static void main(String[] args) {

        ArrayList<Integer> value1 = new ArrayList<Integer>();
        value1.add(10);
        value1.add(20);
        value1.add(10);
        value1.add(40);
        Set uniqiepercent = unicValuesArrays(value1);
        System.out.println("Получаем уникальные значения: " + uniqiepercent);

    }



}

