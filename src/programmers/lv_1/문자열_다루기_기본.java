package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 문자열_다루기_기본 implements ProgrammersQuiz {

    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        char[] cArr = s.toCharArray();
        for (char c : cArr) {
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }

    @Override
    public void execute() {
        String s = "a1245";

        boolean result = solution(s);

        System.out.println(result);
    }

}
