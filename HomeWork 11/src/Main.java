import java.time.LocalDate;
public class Main {
    //Task 1 method
    public static void checkLongYear(long year) {
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
    public static void checkSoftwareVersion(int number, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && number < currentYear && number > 0) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && number >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && number < currentYear && number > 0) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && number >= currentYear && number > 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Вы указали данные некорректно");
        }
    }
    //===================================================================================


    //Task 3 method
    public static void checkDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20 && deliveryDistance >= 0) {
            System.out.println("Доставка будет осуществлена в течение одного дня.");
        } else if (deliveryDistance <= 60 && deliveryDistance >= 0) {
            System.out.println("Доставка будет осуществлена в течение двух дней.");
        } else if (deliveryDistance <= 100 && deliveryDistance >= 0) {
            System.out.println("Доставка будет осуществлена в течение трёх дней.");
        } else {
            System.out.println("Вы слишком далеко или указали некорректные данные.");
        }
    }
    //===================================================================================


    public static void main(String[] args) {
        System.out.println("Task 1");
        checkLongYear(2015);
        checkLongYear(1588);
        checkLongYear(2013);

        System.out.println("\nTask 2");
        checkSoftwareVersion(2015, 0);
        checkSoftwareVersion(2015, 1);
        checkSoftwareVersion(2015, 2);

        System.out.println("\nTask 3");
        checkDeliveryTime(95);
        checkDeliveryTime(1);
        checkDeliveryTime(194);
    }
}
