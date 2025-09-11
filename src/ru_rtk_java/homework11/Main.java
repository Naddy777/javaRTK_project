package ru_rtk_java.homework11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Cars> cars = new ArrayList<>();
        try{
            Files.lines(Paths.get("C:\\Users\\volll\\IdeaProjects\\javaRTK_project\\src\\cars.txt")) //подгружаем из файла
                    .map(line -> line.split("\\|")) // Разделяем каждую строку на части по символу "|"
                    .forEach( parts -> {// Каждую часть (по 5 элементов) закидываем в Cars
                        if (parts.length >=5){
                            cars.add(new Cars(parts[0], parts[1], parts[2], Long.parseLong(parts[3]), Double.parseDouble(parts[4])));
                        }
                    });
        }catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
        String colorToFind = "Black";
        double mileageToFind = 0.0;
        double priceMin = 700000.0;
        double priceMax = 800000.0;

        System.out.println(cars.toString());//выводим все авто, 1 вариант
//        System.out.println("Автомобили в базе: ");//выводим все авто, 2 вариант через forEach
//        cars.forEach(System.out::println);// итерируемся по списку
// 1. Вывести авто по цвету и пробегу:
        List<String> filtreColorProbeg = cars.stream()
                .filter(car -> car.getColor().equals(colorToFind)|| car.getProbeg() == mileageToFind)
                .map(Cars::getAutoId)
                .collect(Collectors.toList());
        System.out.println("Номера авто по цвету " + colorToFind + " и пробегу " + mileageToFind + ": " + filtreColorProbeg );
        // 2. Посчитаем количество уникальных моделей в ценовом диапазоне от 700 тыс. до 800 тыс. руб.:
        int unicModelCount = (int) cars.stream()// наш дабл переводим в инт (если б был лонг - переводить не надо)
                .filter(car -> car.getPrice()>=priceMin && car.getPrice() <=priceMax)//фильтруем
                .map(Cars::getModel)//берем поле Модель
                .distinct()// выбираем уникальные без дубликатов
                .count();
        System.out.println("Количество уникальных моделей в ценовом диапазоне от " + priceMin + " до " + priceMax + ": " + unicModelCount + " шт. ");
        // 3. Вывести цвет автомобиля с минимальной стоимостью
        Optional<String> colorMinPrice = cars.stream()
                .min(Comparator.comparingDouble(Cars::getPrice))
                .map(Cars::getColor)
                ;

        System.out.println("Цвет автомобиля с минимальной стоимостью: " + colorMinPrice);

        // 4. Средняя стоимость моделей Тойота
        String model1 = "Toyota";
        String model2 = "Volvo";

        double modelPriceEvereg = cars.stream()
                .filter(car -> car.getModel().equals(model1))
                .mapToDouble(Cars::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("Средняя стоимость автомобилей модели " + model1 + " "+ modelPriceEvereg);

        double modelPriceEvereg2 = cars.stream()
                .filter(car -> car.getModel().equals(model2))
                .mapToDouble(Cars::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("Средняя стоимость автомобилей модели" + model2 +" "+ modelPriceEvereg2);


        System.out.println("Цвет автомобиля с минимальной стоимостью: " + colorMinPrice);








    }
}
