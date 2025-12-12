package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 자릿수_더하기 implements ProgrammersQuiz {

    public int solution(int n) {
        int answer = 0;

        String nStr = String.valueOf(n);
        for (char c : nStr.toCharArray()) {
            answer += c - '0';
        }

        return answer;
    }

    @Override
    public void execute() {
        int n = 534;

        int result = solution(n);

        System.out.println(result);
    }

}
