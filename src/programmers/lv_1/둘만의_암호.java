package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.HashSet;

public class 둘만의_암호 implements ProgrammersQuiz {

    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        HashSet<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        for (char c : s.toCharArray()) {
            char curChar = c;
            int moved = 0;

            do {
                curChar = rotateChar((char) (curChar + 1));
                if (!skipSet.contains(curChar)) {
                    moved++;
                }
            } while (moved != index);

            answer.append(curChar);
        }

        return answer.toString();
    }

    private char rotateChar(char c) {
        if (c <= 'z') {
            return c;
        }

        return (char) ('a' + (c - 'a') % 26);
    }

    @Override
    public void execute() {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        String result = solution(s, skip, index);

        System.out.println(result);
    }
}
