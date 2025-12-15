package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 지폐_접기 implements ProgrammersQuiz {

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (true) {
            boolean isDone = wallet[0] >= bill[0] && wallet[1] >= bill[1] || wallet[0] >= bill[1] && wallet[1] >= bill[0];
            if (isDone) {
                break;
            }

            if (bill[0] > bill[1]) {
                bill[0] = bill[0] / 2;
            } else {
                bill[1] = bill[1] / 2;
            }

            answer++;
        }

        return answer;
    }

    @Override
    public void execute() {
        int[] wallet = {30, 15};
        int[] bill = {26, 17};

        int result = solution(wallet, bill);

        System.out.println(result);
    }
}
