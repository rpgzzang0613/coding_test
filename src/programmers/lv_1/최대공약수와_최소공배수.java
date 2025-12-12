package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;

public class 최대공약수와_최소공배수 implements ProgrammersQuiz {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int min = Math.min(n, m);
        int max = Math.max(n, m);

        answer[0] = getGcd(max, min);
        answer[1] = max * min / answer[0];

        return answer;
    }

    private int getGcd(int max, int min) {
        if (max % min == 0) {
            return min;
        }

        return getGcd(min, max % min);
    }

    @Override
    public void execute() {
        int n = 60;
        int m = 48;

        int[] result = solution(n, m);

        System.out.println(Arrays.toString(result));
    }

}
