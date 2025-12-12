package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;

public class 같은_숫자는_싫어 implements ProgrammersQuiz {

    public int[] solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        int prevNum = arr[0];
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (prevNum != arr[i]) {
                sb.append(arr[i]);
            }
            prevNum = arr[i];
        }

        char[] charArr = sb.toString().toCharArray();
        int[] result = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            result[i] = charArr[i] - '0';
        }

        return result;
    }

    @Override
    public void execute() {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        int[] result = solution(arr);

        System.out.println(Arrays.toString(result));
    }

}
