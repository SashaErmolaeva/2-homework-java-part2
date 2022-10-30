public class dz2 {
    public static void main(String[] args) {
        int money = 450;
        int payment = 700;
        int balance = money + payment;

        int bonus;
        if (balance >= 1000) {
            bonus = balance/100;
        } else {
            bonus = 0;
        }
        System.out.println("Всего на вашем счету: " + bonus + " бонусов");

    }
}