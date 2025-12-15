package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;

public class 모의고사 implements ProgrammersQuiz {

    public int[] solution(int[] answers) {
        int[] aArr = {1, 2, 3, 4, 5};
        int[] bArr = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] cArr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            int aIndex = aArr.length > i ? i : i % aArr.length;
            int bIndex = bArr.length > i ? i : i % bArr.length;
            int cIndex = cArr.length > i ? i : i % cArr.length;

            if (answers[i] == aArr[aIndex]) {
                score[0]++;
            }

            if (answers[i] == bArr[bIndex]) {
                score[1]++;
            }

            if (answers[i] == cArr[cIndex]) {
                score[2]++;
            }
        }

        int max = Arrays.stream(score).max().getAsInt();

        int len = 0;
        for (int i : score) {
            if (max == i) {
                len++;
            }
        }

        int[] answer = new int[len];

        int idx = 0;
        for (int i = 0; i < score.length; i++) {
            if (max == score[i]) {
                answer[idx] = i + 1;
                idx++;
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        int[] answers = {2, 3, 2, 4, 2, 3, 2, 4, 1, 2, 4, 5, 5, 2, 1};

        int[] result = solution(answers);

        System.out.println(Arrays.toString(result));
    }
}
