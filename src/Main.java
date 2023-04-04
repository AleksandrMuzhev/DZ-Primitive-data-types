// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int amount = 13676; //стоимость билета
        int bonus = 20; //количество рублей для одной бонусной мили

        int accrual = amount / bonus; //accrual - количество начисленных бонусных миль
        if (amount >= 20) {
            System.out.println(accrual);
        } else {
            System.out.println("Бонусные мили = 0");
        }
    }
}