package programmers.lv_1;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {
    int[] arr = {8, 3, 9, 7, 6};

    int[] result = solution(arr);

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] answer = new int[arr.length - 1];

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        boolean isRemoved = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                isRemoved = true;
                continue;
            }

            if (isRemoved) {
                answer[i-1] = arr[i];
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(Arrays.toString(result));
    }

}
