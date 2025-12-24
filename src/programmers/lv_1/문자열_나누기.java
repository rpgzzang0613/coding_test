package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 문자열_나누기 implements ProgrammersQuiz {

    public int solution(String s) {
        int answer = 0;

        int same = 0;
        int diff = 0;
        char c = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                same++;
            } else {
                diff++;
            }

            if (same > 0 && same == diff) {
                answer++;
                diff = 0;
                same = 0;
                if (i + 1 < s.length()) {
                    c = s.charAt(i + 1);
                }
            }
        }

        if (same > 0) {
            answer++;
        }

        return answer;
    }

    @Override
    public void execute() {
        String s1 = "banana";            // 3
        String s = "abracadabra";      // 6
        String s3 = "aaabbaccccabba";   // 3

        int result = solution(s);

        System.out.println(result);
    }
}
