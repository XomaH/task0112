public class Main {
    public static void main(String[] args) {



        checkingTheYea(2020);
        needingApdateOs(2015, 1);
        System.out.println(calcDeliveryDay(40));


    }

    private static void checkingTheYea(int year) {

        if (year < 1584) {
            System.out.println(year + "До 1584 не использовался високосный год");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void needingApdateOs(int clientDeviceYear, int clientOS) {
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static int calcDeliveryDay(int deliveryDistance) {
        int delDey = 0;
        if (deliveryDistance <= 20) {
            delDey += 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            delDey = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            delDey = 3;
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        return delDey;
    }
}



