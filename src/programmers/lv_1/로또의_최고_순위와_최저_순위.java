package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class 로또의_최고_순위와_최저_순위 implements ProgrammersQuiz {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        Set<Integer> winSet = Arrays.stream(win_nums)
                .boxed()
                .collect(Collectors.toSet());

        int zeroCnt = 0;
        int matchedCnt = 0;

        for (int l : lottos) {
            if (winSet.contains(l)) {
                matchedCnt++;
            }
            if (l == 0) {
                zeroCnt++;
            }
        }

        answer[0] = getRank(matchedCnt + zeroCnt);
        answer[1] = getRank(matchedCnt);

        return answer;
    }

    private int getRank(int matchedCnt) {
        if (matchedCnt < 2) {
            return 6;
        }

        return 7 - matchedCnt;
    }

    @Override
    public void execute() {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int[] result = solution(lottos, win_nums);

        System.out.println(Arrays.toString(result));
    }
}
