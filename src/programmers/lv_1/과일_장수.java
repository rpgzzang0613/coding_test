package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;
import java.util.Collections;

public class 과일_장수 implements ProgrammersQuiz {

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        int[][] boxes = new int[score.length / m][m];

        int[] sortedArr = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int index = 0;
        for (int[] box : boxes) {
            for (int i = 0; i < box.length; i++) {
                box[i] = sortedArr[index];
                index++;
            }
        }

        for (int[] box : boxes) {
            int min = Arrays.stream(box).min().orElseThrow();
            answer += min * m;
        }

        return answer;
    }

    @Override
    public void execute() {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        int result = solution(k, m, score);

        System.out.println(result);
    }
}
