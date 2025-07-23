package ru_rtk_java.homework4;

public class App {
    public static void main(String[] args) {
        Telewisor telewisor1 = new Telewisor("LG",  60,true,50_000);
        Telewisor telewisor2 = new Telewisor("Sony",  120,true,200_000);
        Telewisor telewisor3 = new Telewisor("Samsung",  120,true,100_000);
        Telewisor telewisor4 = new Telewisor ();
        Telewisor telewisor5 = new Telewisor("",  0,false,100_000);

        System.out.printf("telewisor1: %s%n", telewisor1);
        System.out.println("telewisor2: " + telewisor2);
        System.out.printf("telewisor4: %s%n", telewisor4);
    }
}
