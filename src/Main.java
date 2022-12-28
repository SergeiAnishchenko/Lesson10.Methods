import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        System.out.println(" ");
        task2();
        System.out.println(" ");
        task3();
    }

    public static void checkLeapYear(int year) {

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " год - високосный год.");
        } else
            System.out.println(year + " год - невисокосный год.");
    }

    public static void selectApplicationVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
    }

    public static void countDeliveryDays(int deliveryDistance) {
        int countOfDeliveryDays = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + countOfDeliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            countOfDeliveryDays = countOfDeliveryDays + 1;
            System.out.println("Потребуется дней: " + countOfDeliveryDays);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            countOfDeliveryDays = countOfDeliveryDays + 2;
            System.out.println("Потребуется дней: " + countOfDeliveryDays);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }
    }


    private static void task1() {
        System.out.println("Задача 1");

        int year = 2022;
        checkLeapYear(year);
    }

    private static void task2() {
        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2015;
        selectApplicationVersion(clientOS, clientDeviceYear);
    }

    private static void task3() {
        System.out.println("Задача 3");

        int deliveryDistance = 95;
        countDeliveryDays(deliveryDistance);
    }
}