package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 최소직사각형 implements ProgrammersQuiz {

    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for (int[] arr : sizes) {
            int w = Math.max(arr[0], arr[1]);
            int h = Math.min(arr[0], arr[1]);

            width = Math.max(width, w);
            height = Math.max(height, h);
        }

        return width * height;
    }

    @Override
    public void execute() {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int result = solution(sizes);

        System.out.println(result);
    }

}
