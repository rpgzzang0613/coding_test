package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 두_정수_사이의_합 implements ProgrammersQuiz {

    public long solution(int a, int b) {
        if (a == b) {
            // 값이 같을 경우 아무 값이나 리턴
            return a;
        }

        if (Math.abs(a) == Math.abs(b)) {
            // 절대값이 같을 경우 0 리턴
            return 0;
        }

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        long answer = 0;
        if (a >= 0 && b >= 0 || a < 0 && b < 0) {
            // 부호가 같을 경우 그냥 더한값 리턴
            for (int i = min; i <= max; i++) {
                answer += i;
            }
        } else {
            int absMin = Math.min(Math.abs(a), Math.abs(b));
            int absMax = Math.max(Math.abs(a), Math.abs(b));
            if (max == absMax) {
                // 양수 절대값이 큰 경우
                int start = absMin + 1;
                for (int i = start; i <= max; i++) {
                    answer += i;
                }
            } else {
                // 음수 절대값이 큰 경우
                int end = -(absMin + 1);
                for (int i = min; i <= end; i++) {
                    answer += i;
                }
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        int a = -2;
        int b = 1;

        long result = solution(a, b);

        System.out.println(result);
    }

}
