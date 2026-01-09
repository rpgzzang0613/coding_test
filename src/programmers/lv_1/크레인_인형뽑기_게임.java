package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.ArrayList;
import java.util.List;

public class 크레인_인형뽑기_게임 implements ProgrammersQuiz {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Integer> basket = new ArrayList<>();

        for (int move : moves) {
            int index = move - 1;

            for (int[] row : board) {
                if (row[index] == 0) {
                    continue;
                }

                if (basket.isEmpty()) {
                    basket.add(row[index]);
                } else {
                    int prev = basket.get(basket.size() - 1);
                    if (row[index] != prev) {
                        basket.add(row[index]);
                    } else {
                        basket.remove(basket.size() -1);
                        answer += 2;
                    }
                }

                row[index] = 0;

                break;
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int result = solution(board, moves);

        System.out.println(result);
    }
}
