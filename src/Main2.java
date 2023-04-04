public class Main2 {
    public static void main(String[] args) {
        int StartScore = 100; //Начальная сумма на счёту клиента
        int TopUpAmount = 1100; //Сумма пополненных клиентом рублей
        int bonusscore = 100; //Сумма от которой добавляется 1 бонусный рубль

        int bonus; //Количество бонусных рублей
        if (TopUpAmount > 1000) {
            bonus = TopUpAmount / bonusscore;
        } else {
            bonus = 0;
        }

        int score = TopUpAmount + StartScore + bonus; //Итоговая сумма на счету
        if (bonus >= 1) {
            System.out.println("бонус равен " + bonus + " рублям, итоговая сумма на счету клиента — " + (TopUpAmount + StartScore + bonus) + " рублей.");
        } else {
            System.out.println("бонусов нет, итоговая сумма на счету клиента — " + (TopUpAmount + StartScore) + " рублей.");
        }

    }
}
