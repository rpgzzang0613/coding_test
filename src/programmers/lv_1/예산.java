package programmers.lv_1;

import java.util.Arrays;

public class 예산 {
    int[] d = {2, 2, 3, 3};
    int budget = 10;

    int result = solution(d, budget);

    public int solution(int[] d, int budget) {
        int[] sorted = Arrays.stream(d).sorted().toArray();

        int sum = 0;

        for (int i = 0; i < sorted.length; i++) {
            sum += sorted[i];

            if (sum > budget) {
                return i;
            }
        }

        return d.length;
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
