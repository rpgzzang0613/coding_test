package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 없는_숫자_더하기 implements ProgrammersQuiz {

    public int solution(int[] numbers) {
        int answer = 0;

        String allNumStr = "0123456789";

        for (int n : numbers) {
            allNumStr = allNumStr.replace(String.valueOf(n), "");
        }

        for (char c : allNumStr.toCharArray()) {
            answer += c - '0';
        }

        return answer;
    }

    @Override
    public void execute() {
        int[] numbers = {1, 2, 3, 5, 7};

        int result = solution(numbers);

        System.out.println(result);
    }

}
