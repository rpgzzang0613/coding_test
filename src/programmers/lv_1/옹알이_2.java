package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;

public class 옹알이_2 implements ProgrammersQuiz {

    public int solution(String[] babbling) {
        int answer = 0;

        String[] possible = {"aya", "ye", "woo", "ma"};

        String[] except = Arrays.stream(possible)
                .map(s -> s + s)
                .toArray(String[]::new);

        for (String b : babbling) {
            if (Arrays.stream(except).anyMatch(b::contains)) {
                continue;
            }

            String tmp = b;
            for (String p : possible) {
                tmp = tmp.replace(p, "-");
            }

            tmp = tmp.replace("-", "");

            if (tmp.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        String[] babbling = {"aye", "yeyema", "yayae", "maya", "mayaa", "wayaoo", "yayae", "woayao"};

        int result = solution(babbling);

        System.out.println(result);
    }
}
