package ru_rtk_java.attestation01;
/*
Формулировка задания:
Необходимо реализовать приложение, принимающее список пользователей, продуктов и обрабатывающее покупку пользователя.
Подробное описание функционала приложения
1. Создать классы Покупатель (Person) и Продукт (Product).
Характеристики Покупателя: имя, сумма денег и пакет с продуктами (массив объектов типа Продукт). Имя не может быть пустой строкой и не может
быть короче 3 символов. Деньги не могут быть отрицательным числом.
Если Покупатель может позволить себе Продукт, то Продукт добавляется в пакет. Если у Покупателя недостаточно денег, то добавление не происходит.
Характеристики Продукта: название и стоимость. Название продукта не может быть пустой строкой, оно должно быть. Стоимость продукта не может
быть отрицательным числом.
2. Поля в классах должны быть private, доступ к полям осуществляется через геттеры и сеттеры или конструктор класса.
3. В классах переопределены методы toString(), equals(), hashcode().
4. Создать в классе App метод main и проверить работу приложения. Данные Покупателей и Продукты вводятся с клавиатуры, для считывания
данных потребуется использовать класс Scanner и его метод nextLine(). Продукты в цикле выбираются покупателями по очереди и, пока не введено
слово END, наполняется пакет.
5. Обработать следующие ситуации:
а. Если покупатель не может позволить себе продукт, то напечатайте соответствующее сообщение ("[Имя человека] не может позволить себе [Название продукта]").
б. Если ничего не куплено, выведите имя человека, за которым следует "Ничего не куплено".
в. В случае неверного ввода - сообщение: "Деньги не могут быть отрицательными", пустого имени - сообщение: "Имя не может быть пустым" или длина имени
менее 3 символов – сообщение: "Имя не может быть короче 3 символов".
 */


import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Person[] persons = new Person[10];
        Product[] products = new Product[10];

        System.out.println("Вводим покупателей через сканер.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя всех покупателей через ; и сумму денег через = : ");// на ввод пойдет Павел Андреевич = 10000; Анна Петровна = 2000; Борис = 10
        String personsSum = scanner.nextLine();// на ввод пойдет ПH = 10000; Анна Петровна = -2000; Борис = 10
        String[] personSum = personsSum.split(";");
//        System.out.println("Наш список покупателей и их корзина в рублях: " + Arrays.toString(personSum));
        int i=0;

            for (String per : personSum) {
                String[] massiv = per.trim().split("=");
                String name = massiv[0].trim();
                if(name.length()<3) {
                    System.out.println("Имя не может быть короче 3 символов! Данные по покупателю " + name + " не занесены!" + "\n");
                }else {
                    double money = Double.parseDouble(massiv[1].trim());
                    if(money<0) {
                        System.out.println("Деньги не могут быть отрицательным числом! Данные по покупателю " + name + " не занесены!" + "\n");
                    }else {
                    persons[i] = new Person(name, money);
//                    System.out.println("Покупатель: " + name + ". Сумма денег у покупателя: " + money);
//                    System.out.println();
//                    persons[i].setName(name);
//                    persons[i].setMoney(money);
                    i++;
                    }
                }

            }
        System.out.println("Выводим на печать всех занесенных в базу покупателей и их баланс: " + Arrays.toString(persons));
        System.out.println();
        System.out.println("Вводим продукты через сканер.");
        Scanner scannerP = new Scanner(System.in);
        System.out.print("Введите перечень продуктов через ; разделитель = : ");// на ввод пойдет Хлеб = 40; Молоко = 60; Торт = 1000; Кофе растворимый = 879; Масло = 150
        String productsSum = scannerP.nextLine();// на ввод пойдет
        String[] productSum = productsSum.split(";");
        int j=0;
            for (String prod : productSum) {
                String[] massivP = prod.trim().split("=");
                String item = massivP[0].trim();
                if(item.length()<1) {
                    System.out.println("Название продукта не может быть пустым! Данные по продукту не занесены!" + "\n");
                }else {
                    float price = Float.parseFloat(massivP[1].trim());
                    if(price<0) {
                        System.out.println("Деньги не могут быть отрицательным числом! Данные по цене продукта " + item + " не занесены!" + "\n");
                    }else {
                        products[j] = new Product(item, price);
//                        System.out.println("Продукты: ");
//                        System.out.println(item + ". Цена: " + price + " рублей.");
                        j++;
                    }
                }
        }
        System.out.println("Выводим на печать все занесенные в базу продукты и их цены: " + Arrays.toString(products));
        System.out.println();
        System.out.println("Вводим покупки наших покупателей через сканер.");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите, что купил покупатель через тире (имя покупатель - продукт). По завершении ввода поставьте END");//  на ввод пойдет: Павел Андреевич - Хлеб
//        Павел Андреевич - Масло
//        Анна Петровна - Кофе растворимый
//        Анна Петровна - Молоко
//        Анна Петровна - Молоко
//        Анна Петровна - Молоко
//        Анна Петровна - Торт
//        Борис - Торт
//        Павел Андреевич - Торт
//        END
        String pokupka = scanner2.nextLine();
        String[] personPokupka = pokupka.trim().split("-");
        String pokupatelName = personPokupka[0].trim();
        String productName = personPokupka[1].trim();
        int l, m;
        for (l = 0; l < persons.length; l++) {
            if(persons[l] != null) {
                if (pokupatelName.equals(persons[l].getName())) {
                    System.out.println("Наш покупатель: " + pokupatelName + "\n");
                    for (m = 0; m < products.length; m++) {
                        if(products[m] != null) {
                            if (productName.equals(products[m].getItem())) {
                                System.out.println("Продукт " + productName + " есть в наличии." + "\n");
                            } else {
                                System.out.println("Продукт " + productName + " отсутствует в списке." + "\n");
                            }
                        }
                    }
                } else {
                    System.out.println("Покупатель" + pokupatelName + " отсутствует в списке покупателей" + "\n");
                }
            }
            }
        }

    }

