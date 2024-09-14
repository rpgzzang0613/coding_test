package programmers.lv_1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {

    long n = 342392840234L;

    int[] result = solution(n);

    public int[] solution(long n) {
        char[] nCharArr = String.valueOf(n).toCharArray();

        int[] answer = new int[nCharArr.length];

        for (int i = 0; i < nCharArr.length; i++) {
            answer[i] = nCharArr[nCharArr.length - 1 - i] - '0';
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(Arrays.toString(result));
    }

}
