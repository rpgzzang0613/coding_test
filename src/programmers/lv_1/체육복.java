package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class 체육복 implements ProgrammersQuiz {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        HashMap<Integer, Integer> peopleMap = new HashMap<>();

        Set<Integer> lostSet = Arrays.stream(lost).boxed().collect(Collectors.toSet());
        Set<Integer> reserveSet = Arrays.stream(reserve).boxed().collect(Collectors.toSet());

        for (int i = 1; i <= n; i++) {
            if (lostSet.contains(i) && reserveSet.contains(i)) {
                peopleMap.put(i, 1);
            } else if (lostSet.contains(i)) {
                peopleMap.put(i, 0);
            } else if (reserveSet.contains(i)) {
                peopleMap.put(i, 2);
            } else {
                peopleMap.put(i, 1);
            }
        }

        for (int i = 1; i <= n; i++) {
            if (peopleMap.get(i) > 0) {
                continue;
            }

            boolean isPrevExists = peopleMap.containsKey(i - 1);
            if (isPrevExists) {
                boolean isReserveOk = peopleMap.get(i - 1) > 1;
                if (isReserveOk) {
                    peopleMap.put(i, peopleMap.get(i) + 1);
                    peopleMap.put(i - 1, peopleMap.get(i - 1) - 1);
                    continue;
                }
            }

            boolean isNextExists = peopleMap.containsKey(i + 1);
            if (isNextExists) {
                boolean isReserveOk = peopleMap.get(i + 1) > 1;
                if (isReserveOk) {
                    peopleMap.put(i, peopleMap.get(i) + 1);
                    peopleMap.put(i + 1, peopleMap.get(i + 1) - 1);
                }
            }
        }

        for (int k : peopleMap.keySet()) {
            if (peopleMap.get(k) > 0) {
                answer++;
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};

        int result = solution(n, lost, reserve);

        System.out.println(result);
    }
}
