package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 implements ProgrammersQuiz {

    public int[] solution(int[] arr, int divisor) {
        int[] filtered = Arrays.stream(arr)
                .filter(x -> x % divisor == 0)
                .sorted()
                .toArray();

        if (filtered.length > 0) {
            return filtered;
        } else {
            return new int[] {-1};
        }
    }

    @Override
    public void execute() {
        int[] arr = {1, 3, 6, 7, 9};
        int divisor = 3;

        int[] result = solution(arr, divisor);

        System.out.println(Arrays.toString(result));
    }

}
