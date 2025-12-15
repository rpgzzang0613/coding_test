package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 기사단원의_무기 implements ProgrammersQuiz {

    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            if (i == 1) {
                answer += 1;
            } else if (i < 3) {
                answer += 2;
            } else {
                int cnt = count(i);
                answer += cnt > limit ? power : cnt;
            }
        }

        return answer;
    }

    public int count(int num) {
        int cnt = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }

        return cnt + 1;
    }

    @Override
    public void execute() {
        int number = 10;
        int limit = 3;
        int power = 2;

        int result = solution(number, limit, power);

        System.out.println(result);
    }
}
