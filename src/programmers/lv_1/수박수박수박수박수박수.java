package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 수박수박수박수박수박수 implements ProgrammersQuiz {

    public String solution(int n) {
        String answer = "수박".repeat(n / 2);

        if (n % 2 != 0) {
            answer = answer + "수";
        }

        return answer;
    }

    @Override
    public void execute() {
        int n = 9;

        String result = solution(n);

        System.out.println(result);
    }

}
