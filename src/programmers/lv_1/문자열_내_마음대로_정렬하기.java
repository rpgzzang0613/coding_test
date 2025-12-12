package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 implements ProgrammersQuiz {

    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted((s1, s2) -> {
            char c1 = s1.toCharArray()[n];
            char c2 = s2.toCharArray()[n];

            return c1 == c2 ? s1.compareTo(s2) : c1 - c2;
        }).toArray(String[]::new);
    }

    @Override
    public void execute() {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        String[] result = solution(strings, n);

        System.out.println(Arrays.toString(result));
    }
}
