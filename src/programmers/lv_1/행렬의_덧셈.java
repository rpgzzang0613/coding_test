package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;

public class 행렬의_덧셈 implements ProgrammersQuiz {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int iLength = arr1.length;
        int jLength = arr1[0].length;

        int[][] answer = new int[iLength][jLength];

        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        int[][] result = solution(arr1, arr2);

        System.out.println(Arrays.deepToString(result));
    }

}
