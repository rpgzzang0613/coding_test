package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 키패드_누르기 implements ProgrammersQuiz {

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        final int STAR = 10;
        final int ZERO = 11;
        final int SHARP = 12;

        int currentLeft = STAR;
        int currentRight = SHARP;

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                currentLeft = num;
                answer.append("L");
            } else if (num == 3 || num == 6 || num == 9) {
                currentRight = num;
                answer.append("R");
            } else {
                if (num == 0) {
                    num = ZERO;
                }

                int leftDiffRow = Math.abs(currentLeft - num) / 3;
                int leftDiffCol = Math.abs(currentLeft - num) % 3;
                int leftDiff = leftDiffRow + leftDiffCol;

                int rightDiffRow = Math.abs(currentRight - num) / 3;
                int rightDiffCol = Math.abs(currentRight - num) % 3;
                int rightDiff = rightDiffRow + rightDiffCol;

                if (leftDiff == rightDiff) {
                    if (hand.equals("left")) {
                        currentLeft = num;
                        answer.append("L");
                    } else {
                        currentRight = num;
                        answer.append("R");
                    }
                } else {
                    if (leftDiff > rightDiff) {
                        currentRight = num;
                        answer.append("R");
                    } else {
                        currentLeft = num;
                        answer.append("L");
                    }
                }
            }
        }

        return answer.toString();
    }

    @Override
    public void execute() {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        String result = solution(numbers, hand);

        System.out.println(result);
    }
}
