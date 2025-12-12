package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 나머지가_1이_되는_수_찾기 implements ProgrammersQuiz {

    public int solution(int n) {
        if (n % 2 == 0) {
            return 1;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return n - 1;
    }

    @Override
    public void execute() {
        int n = 32;

        int result = solution(n);

        System.out.println(result);
    }

}
