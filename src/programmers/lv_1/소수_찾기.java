package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 소수_찾기 implements ProgrammersQuiz {

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void execute() {
        int n = 10;

        int result = solution(n);

        System.out.println(result);
    }
}
