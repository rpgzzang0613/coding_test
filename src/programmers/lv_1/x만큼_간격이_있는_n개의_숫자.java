package programmers.lv_1;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {
    int x = -4;
    int n = 4;

    long[] result = solution(x, n);

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(Arrays.toString(result));
    }
}
