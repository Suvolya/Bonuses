public class Main {
    public static void main(String[] args) {
        int check = 1200;
        int replenishmentAmount = 100;
        int bonuse;



        if (check > 1000) {
            bonuse = check / 100;
            int totalCheck = check + replenishmentAmount + bonuse;
            System.out.println("Остаток на счете: " + totalCheck + " руб.");
            System.out.println("Начислено бонусов: " + bonuse + " руб.");
        } else {
            System.out.println("Сумма пополнения меньше 1000 руб.");
        }
    }
}