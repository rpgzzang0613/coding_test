package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Arrays;

public class 폰켓몬 implements ProgrammersQuiz {

    public int solution(int[] nums) {
        int limitCount = nums.length / 2;
        int typeCount = (int) Arrays.stream(nums).distinct().count();

        return Math.min(limitCount, typeCount);
    }

    @Override
    public void execute() {
        int[] nums = {3, 3, 3, 2, 2, 2};

        int result = solution(nums);

        System.out.println(result);
    }
}
