package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 부족한_금액_계산하기 implements ProgrammersQuiz {

    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        for (int i = 1; i <= count; i++) {
            totalPrice += (long) price * i;
        }

        if (totalPrice > money) {
            return totalPrice - money;
        } else {
            return 0;
        }
    }

    @Override
    public void execute() {
        int price = 3;
        int money = 20;
        int count = 4;

        long result = solution(price, money, count);

        System.out.println(result);
    }

}
