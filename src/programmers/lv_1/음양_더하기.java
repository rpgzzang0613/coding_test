package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 음양_더하기 implements ProgrammersQuiz {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        int result = solution(absolutes, signs);

        System.out.println(result);
    }

}
