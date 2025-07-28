package ru_rtk_java.homework4;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Telewisor [] telewisor = new   Telewisor [10];

        telewisor[0] = new Telewisor("LG",  60,"есть",50_000);
        telewisor[0].SetTV();
        telewisor[1] = new Telewisor("Sony",  120,"есть",200_000);
        telewisor[1].SetTV();
        telewisor[2] = new Telewisor("Samsung",  120,"есть",100_000);
        telewisor[2].SetTV();
        telewisor[4] = new Telewisor("Российский аналог",  60,"нет",100_000);
        telewisor[4].SetTV();

        System.out.println("Хотите задать параметры вручную? (yes/no)");
        String vibor = scanner.nextLine().trim().toLowerCase();

        if("yes".equals(vibor)) {
            Scanner scanner1 = new Scanner(System.in);// создаем телевизор через ввод с клавиатуры
            System.out.print("Введите модель телевизора: ");
            String model1 = scanner1.nextLine();

            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Введите частоту обновления: ");
            int refreshRate1 = scanner2.nextInt();

            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Введите наличие smartTV: есть/нет: ");
            String smartTV1 = scanner3.nextLine();

            Scanner scanner4 = new Scanner(System.in);
            System.out.print("Введите цену телевизора: ");
            int price1 = scanner4.nextInt();

            telewisor[5] = new Telewisor(model1,  refreshRate1, smartTV1, price1);
            telewisor[5].SetTV();
        }else {// если нет, то рандомно выбираем из заданного списка моделей и всех остальных полей
            String[] spisokModels = {"LG", "Sony", "Samsung", "Российский аналог"};
            int indexModel = random.nextInt(spisokModels.length);
            int[] spisokRefreshRate = {100, 60, 120, 80};
            int indexRefreshRate = random.nextInt(spisokRefreshRate.length);
            String [] spisokSmartTV = {"есть", "нет"};
            int indexspisokSmartTV = random.nextInt(spisokSmartTV.length);
            int randprice =random.nextInt(200_000);

            telewisor[3] = new Telewisor(spisokModels[indexModel],  spisokRefreshRate[indexRefreshRate], spisokSmartTV[indexspisokSmartTV], randprice);
            telewisor[3].SetTV();
        }

        telewisor[0].turnOn();
        telewisor[0].Sostoyanie();
        System.out.println("Телевизоры:" + telewisor[0] +  telewisor[1] + "\n");
        System.out.println("Все телевизоры в магазине: " + Arrays.deepToString(telewisor));

    }
}
