import java.time.LocalDate;

public class Main {
    //Task 1 method
    public static void checkLeapYear(long year) {
        boolean yearDivBy4 = year % 4 == 0;
        boolean yearDivBy100 = year % 100 != 0;
        boolean yearDivBy400 = year % 400 == 0;
        boolean moreThan1584 = year >= 1584;
        if (moreThan1584 && yearDivBy4 && (yearDivBy100 || yearDivBy400)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный или вы указали некорректный год.");
        }
    }
    //===================================================================================


    //Task 2 method
    public static void recommendAppVersionBasedOnYearAndOS(int number, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && number < currentYear && number > 0) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && number >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && number < currentYear && number > 0) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && number >= currentYear && number > 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else  {
            System.out.println("Данные указаны некорректно.");
        }
    }
    //===================================================================================


    //Task 3 method
    public static int calculateDeliveryTime(int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance <= 20 && deliveryDistance >= 0) {
            deliveryTime = 1;
            return deliveryTime;
        } else if (deliveryDistance <= 60 && deliveryDistance >= 0) {
            deliveryTime = 2;
            return deliveryTime;
        } else if (deliveryDistance <= 100 && deliveryDistance >= 0) {
            deliveryTime = 3;
            return deliveryTime;
        } else {
            return 0;
        }
    }
    //===================================================================================


    public static void main(String[] args) {
        System.out.println("Task 1");
        checkLeapYear(2015);
        checkLeapYear(1588);
        checkLeapYear(2013);

        System.out.println("\nTask 2");
        recommendAppVersionBasedOnYearAndOS(2015, 0);
        recommendAppVersionBasedOnYearAndOS(2024, 2);
        recommendAppVersionBasedOnYearAndOS(2012, 1);


        System.out.println("\nTask 3");
        calculateDeliveryTime(95);
        calculateDeliveryTime(1);
        calculateDeliveryTime(194);
    }
}
//По задаче 2 - почитайте внимательнее условия задачи, про 2015 год написано в старом условии задачи, в новом же чёрным
// по белому написано - "Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android )
// и год выпуска устройства. Если устройство старше текущего года, предложите ему установить облегченную версию."