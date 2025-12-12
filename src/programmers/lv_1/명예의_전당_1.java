package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 명예의_전당_1 implements ProgrammersQuiz {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);

            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }

            answer[i] = hallOfFame.peek();
        }

        return answer;
    }

    @Override
    public void execute() {
        int k = 9;
        int[] score = {100, 10, 10 , 10, 1000 , 100, 1000};

        int[] result = solution(k, score);

        System.out.println(Arrays.toString(result));
    }

}
