package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 이웃한_칸 implements ProgrammersQuiz {

    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        int MAX = board.length - 1;

        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        String color = board[h][w];

        for (int i = 0; i < dh.length; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if (h_check >= 0 && h_check <= MAX && w_check >= 0 && w_check <= MAX && board[h_check][w_check].equals(color)) {
                answer++;
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        String[][] board = {
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}
        };

        int h = 1;
        int w = 1;

        int result = solution(board, h, w);

        System.out.println(result);
    }
}
