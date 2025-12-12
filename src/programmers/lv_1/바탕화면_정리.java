package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 바탕화면_정리 implements ProgrammersQuiz {

    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        final int MIN_Y = 0;
        final int MIN_X = 1;
        final int MAX_Y = 2;
        final int MAX_X = 3;

        int fileCnt = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            String oneLine = wallpaper[i];
            for (int j = 0; j < oneLine.length(); j++) {
                char symbol = oneLine.charAt(j);

                if (symbol != '#') {
                    continue;
                }

                fileCnt++;

                if (fileCnt == 1) {
                    answer[MIN_X] = j;
                    answer[MIN_Y] = i;
                    answer[MAX_X] = j + 1;
                    answer[MAX_Y] = i + 1;
                } else {
                    if (answer[MIN_X] > j) {
                        answer[MIN_X] = j;
                    }
                    if (answer[MAX_X] < j + 1) {
                        answer[MAX_X] = j + 1;
                    }
                    if (answer[MAX_Y] < i + 1) {
                        answer[MAX_Y] = i + 1;
                    }
                }
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        String[] wallpaper = {"..", "#."};

        int[] result = solution(wallpaper);

        for (int i : result) {
            System.out.println(i);
        }
    }

}
