package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 다트게임_1차 implements ProgrammersQuiz {

    public int solution(String dartResult) {
        int answer = 0;

        List<Integer> scoreList = new ArrayList<>();

        Pattern pattern = Pattern.compile("(\\d+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);

        while (matcher.find()) {
            int score = Integer.parseInt(matcher.group(1));
            String bonus = matcher.group(2);
            String option = matcher.group(3);

            score = switch (bonus) {
                case "D" -> score * score;
                case "T" -> score * score * score;
                default -> score;
            };

            if ("*".equals(option)) {
                score = score * 2;

                if (!scoreList.isEmpty()) {
                    int prevScore = scoreList.get(scoreList.size() - 1);
                    scoreList.set(scoreList.size() - 1, prevScore * 2);
                }
            } else if ("#".equals(option)) {
                score = score * -1;
            }

            scoreList.add(score);
        }

        for (int score : scoreList) {
            answer += score;
        }

        return answer;
    }

    @Override
    public void execute() {
        String dartResult = "1T2D3D#";

        int result = solution(dartResult);

        System.out.println(result);
    }
}
