package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 콜라_문제 implements ProgrammersQuiz {

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int given = n / a * b;
            int remain = n % a;

            answer += given;

            n = given + remain;
        }

        return answer;
    }

    @Override
    public void execute() {
        int a = 3;
        int b = 1;
        int n = 20;

        int result = solution(a, b, n);

        System.out.println(result);
    }
}
