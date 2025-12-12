package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 정수_제곱근_판별 implements ProgrammersQuiz {

    public long solution(long n) {
        long answer = -1L;

        double sqrt = Math.sqrt(n);
        if (sqrt == (int) sqrt) {
            int plusOne = (int) sqrt + 1;
            answer = (long) plusOne * plusOne;
        }

        return answer;
    }

    @Override
    public void execute() {
        long n = 118372L;

        long result = solution(n);

        System.out.println(result);
    }

}
