public class Main {

    public static void main(String[] args) {

        int initialAmount = 400; // начальная сумма счёта
        int depositAmount = 1000; // сумма пополнения
        int bonus; // бонусные рубли за пополнение

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }

        int balance = initialAmount + depositAmount + bonus; // итоговая сумма счета

        System.out.println("Начиленные бонусные рубли:" + bonus);
        System.out.println("Баланс:" + balance);
    }
}
