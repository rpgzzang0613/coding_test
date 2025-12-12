package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 가운데_글자_가져오기 implements ProgrammersQuiz {

    public String solution(String s) {
        if (s.length() == 1) {
            return s;
        }

        int len = s.length();

        if (len % 2 != 0) {
            return String.valueOf(s.charAt(len / 2));
        } else {
            return String.valueOf(s.charAt(len / 2 - 1)) + s.charAt(len / 2);
        }
    }

    @Override
    public void execute() {
        String s = "DFKS";

        String result = solution(s);

        System.out.println(result);
    }

}
