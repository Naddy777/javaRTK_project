package ru_rtk_java.homework7;
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


import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Person[] persons = new Person[10];
        Product[] products = new Product[10];
        int hourNow = LocalDateTime.now().getHour();

        System.out.println("Вводим покупателей через сканер.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя всех покупателей через ; и сумму денег через = : ");// на ввод пойдет Павел Андреевич = 10000; Анна Петровна = 2000; Борис = 10
        String personsSum = scanner.nextLine();
        String[] personSum = personsSum.split(";");
        int i = 0;

        for (String per : personSum) {
            String[] massiv = per.trim().split("=");
            if (massiv.length>1) {
                String name = massiv[0].trim();
                float money = Float.parseFloat(massiv[1].trim());
                try{
                    persons[i] = new Person(name, money);
                    i++;
                } catch (IllegalArgumentException e){
                    System.err.println(e.getMessage());//Отработка ошибок
                }
            }else {
                System.out.println("Некорректный ввод. Не введен кошелек покупателя ");
            }
        }
        if(persons[0] != null){

            System.out.println();
            System.out.println("Вводим продукты через сканер.");
            Scanner scannerP = new Scanner(System.in);
            System.out.print("Введите перечень продуктов и их цену через ; разделитель = : ");// на ввод пойдет Хлеб = 40; Молоко = 60; Торт = 1000; Кофе растворимый = 879; Масло = 150
            String productsSum = scannerP.nextLine();
            String[] productSum = productsSum.split(";");
            int j = 0;
            for (String prod : productSum) {
                String[] massivP = prod.trim().split("=");
                if (massivP.length > 1) {
                    String item = massivP[0].trim();
                    float price = Float.parseFloat(massivP[1].trim());
                    try{
                        products[j] = new Product(item, price);
                        j++;
                    }catch (IllegalArgumentException e){
                        System.err.println(e.getMessage());//Отработка ошибок
                    }
                } else {
                    System.out.println("Некорректный ввод. Не введена цена продукта ");
                }
            }
            System.out.println();
            System.out.println("Вводим покупки наших покупателей через сканер.");
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Введите, что купил покупатель в формате: имя покупателя - продукт: ");
            while (true) {

                String pokupka = scanner2.nextLine();
                if (pokupka.equals("END")) {
                    System.out.println("Ввод завершен.");
                    break;
                } else {
                    String[] personPokupka = pokupka.trim().split("-");
                    if (personPokupka.length > 1) {
                        String pokupatelName = personPokupka[0].trim();
                        String productName = personPokupka[1].trim();
                        int l, m;
                        int z = 0;
                        int g = 0;
                        for (l = 0; l < persons.length; l++) {
                            if (persons[l] != null) {
                                if (pokupatelName.equals(persons[l].getName())) {
//                            System.out.println("Наш покупатель: " + pokupatelName + "\n");
                                    for (m = 0; m < products.length; m++) {
                                        if (products[m] != null) {
                                            if (productName.equals(products[m].getItem())) {
                                                System.out.println("Продукт " + productName + " есть в наличии.");
                                                persons[l].buyProduct(products[m]);
                                                System.out.println("У покупателя " + persons[l].getName() + " осталось " + persons[l].getMoney() + " рублей. " + "\n");
                                                z = 1;
                                                break;
                                            } else {
//                                                System.out.println("Продукта " + productName + " нет в наличии. ");
                                            }
                                        }
                                    }
                                    if(z != 1){System.out.println("Продукта " + productName + " нет в наличии. ");}
                                    g = 1;
                                }
                            }else {
//                                System.out.println("Некорректный ввод. Нет покупателя/не указан покупатель!");break;
                            }
                        }
                        if(g != 1){System.out.println("Нет такого покупателя/не указан покупатель! ");}
                    } else {
                        System.out.println("Некорректный ввод. Не введен продукт ");
                    }
                }
                System.out.print("Введите, что купил следующий покупатель в формате: имя покупателя - продукт. (завершение цикла - END): ");
            }

        System.out.println("Наши покупатели купили: ");
        int k;
        for(k=0;k<persons.length; k++ ) {
            if (persons[k] != null) {
                if (persons[k].getProducts().isEmpty()) {
                    System.out.println( "\n"+ persons[k].getName() + " - Ничего не куплено");
                }else {
                    String a = persons[k].toString();
                    System.out.println( a );
                }
            }
        }
        }else {
            System.out.println("Покупатели не заведены. ");
        }
    }
}
    /* Данные для ввода:
    Павел Андреевич = 10000; Анна Петровна = 2000; Борис = 10
    Хлеб = 40; Молоко = 60; Торт = 1000; Кофе растворимый = 879; Масло = 150
    Павел Андреевич - Хлеб
    Павел Андреевич - Масло
    Анна Петровна - Кофе растворимый
        Анна Петровна - Молоко
        Анна Петровна - Молоко
        Анна Петровна - Молоко
        Анна Петровна - Ягода
        Борис - Торт
        Павел Андреевич - Торт
        END
     */

