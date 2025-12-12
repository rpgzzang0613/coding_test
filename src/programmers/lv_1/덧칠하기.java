package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 덧칠하기 implements ProgrammersQuiz {

    public int solution(int wallWidth, int rollerWidth, int[] section) {
        int answer = 0;

        boolean[] repaintWalls = new boolean[wallWidth];
        for (int num : section) {
            repaintWalls[num - 1] = true;
        }

        for (int i = 0; i < repaintWalls.length; i++) {
            if (repaintWalls[i]) {
                int endOfPaint = Math.min(wallWidth, i + rollerWidth);
                for (int j = i; j < endOfPaint; j++) {
                    repaintWalls[j] = false;
                }

                if (endOfPaint == wallWidth) {
                    answer++;
                    break;
                }
                answer++;
                i = endOfPaint - 1;
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        int wallWidth = 4;
        int rollerWidth = 1;
        int[] section = {1, 2, 3, 4};

        int result = solution(wallWidth, rollerWidth, section);

        System.out.println(result);
    }

}
