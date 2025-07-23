package ru_rtk_java.homework3;
import java.util.Random;

public class Play {
    public static void main(String[] args) {
        Random random = new Random();
        String [] figuraPlay = { "Камень", "Ножницы", "Бумага"};
        String vasyaChois = figuraPlay[random.nextInt(figuraPlay.length)];//выбираем по индексу, а не слово
        String petyaChois = figuraPlay[random.nextInt(figuraPlay.length)];
        System.out.println("Вася загадал: " + vasyaChois);
        System.out.println("Петя загадал: " + petyaChois);

        if (vasyaChois.equals(petyaChois)){
            System.out.println("Ничья!");
        } else if (
                (vasyaChois.equals("Камень") && petyaChois.equals("Ножницы")) ||// equals учитывает регистр
                        (vasyaChois.equals("Ножницы") && petyaChois.equals("Бумага")) ||
                        (vasyaChois.equals("Бумага") && petyaChois.equals("Камень"))
                )// Есть еще equalsIgnoreCase - не учитывает регистр
        {
            System.out.println("Победил Вася!");

        }else {
            System.out.println("Победил Петя!");
        }
    }
}
