package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 내적 implements ProgrammersQuiz {

    public int solution(int[] a, int[] b) {
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }

        return result;
    }

    @Override
    public void execute() {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        int result = solution(a, b);
        System.out.println(result);
    }

}
