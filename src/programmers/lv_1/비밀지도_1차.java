package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;

public class 비밀지도_1차 implements ProgrammersQuiz {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            String firstBin = convert(n, arr1[i]);
            String secondBin = convert(n, arr2[i]);

            StringBuilder res = new StringBuilder();
            for (int j = 0; j < firstBin.length(); j++) {
                int sum = (firstBin.charAt(j) - '0') + (secondBin.charAt(j) - '0');
                res.append(sum > 0 ? "#" : " ");
            }

            answer[i] = res.toString();
        }

        return answer;
    }

    public String convert(int n, int targetNum) {
        return String.format("%" + n + "s", Integer.toBinaryString(targetNum))
                .replace(' ', '0');
    }

    @Override
    public void execute() {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] result = solution(n, arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}
