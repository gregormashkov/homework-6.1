public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else {
            System.out.println("Установите приложение для Android по ссылке");
        }
        // Задание 2
        int clientOS1 = 0;
        int clientDeviceYear = 2020;

        if (clientOS1 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            // Задание 3
            int year = 2020;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " является високосным");
            } else {
                System.out.println(year + " не является високосным");
            }
            // Задание 4
            int deliveryDisntance = 95;
            int deliveryDays = 1;

            if (deliveryDisntance > 20) {
                deliveryDays++;
            }
            if (deliveryDisntance > 60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Недопустимое значение");
                // Задание завершено
        }}}
