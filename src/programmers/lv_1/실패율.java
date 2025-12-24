package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 실패율 implements ProgrammersQuiz {

    // N : 총 스테이지수
    // stages : 유저가 멈춘 스테이지 번호 배열
    // 실패율 : 미클리어 / 도달
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> gradeMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int fail = 0;
            int reached = 0;
            for (int s : stages) {
                if (s >= i) {
                    reached++;

                    if (s == i) {
                        fail++;
                    }
                }
            }

            gradeMap.put(i, reached == 0 ? 0.0 : (double) fail / reached);
        }

        return gradeMap.entrySet().stream()
                .sorted((a, b) -> {
                    int compared = Double.compare(b.getValue(), a.getValue());

                    if (compared == 0) {
                        return Integer.compare(a.getKey(), b.getKey());
                    }

                    return compared;
                })
                .mapToInt(Map.Entry::getKey).toArray();
    }

    @Override
    public void execute() {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int[] result = solution(N, stages);

        System.out.println(Arrays.toString(result));
    }
}
