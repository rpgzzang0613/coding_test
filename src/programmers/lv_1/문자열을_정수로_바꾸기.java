package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 문자열을_정수로_바꾸기 implements ProgrammersQuiz {

    public int solution(String s) {
        return Integer.parseInt(s);
    }

    @Override
    public void execute() {
        String s = "-1234";

        int result = solution(s);

        System.out.println(result);
    }

}
