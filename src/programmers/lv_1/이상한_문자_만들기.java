package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 이상한_문자_만들기 implements ProgrammersQuiz {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        char[] sChars = s.toCharArray();

        int wordIdx = 0;
        for (char sChar : sChars) {
            if (sChar == ' ') {
                wordIdx = 0;
                answer.append(sChar);
                continue;
            }

            if (wordIdx % 2 == 0) {
                if ('a' <= sChar && sChar <= 'z') {
                    answer.append((char) (sChar - 32));
                } else {
                    answer.append(sChar);
                }
            } else {
                if ('A' <= sChar && sChar <= 'Z') {
                    answer.append((char) (sChar + 32));
                } else {
                    answer.append(sChar);
                }
            }

            wordIdx++;
        }

        return new String(answer);
    }

    @Override
    public void execute() {
        String s = "a A z Z ";

        String result = solution(s);

        System.out.println(result);
    }

}
