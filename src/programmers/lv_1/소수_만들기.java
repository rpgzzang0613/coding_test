package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 소수_만들기 implements ProgrammersQuiz {

    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void execute() {
        int[] nums = {1, 2, 7, 6, 4};

        int result = solution(nums);

        System.out.println(result);
    }
}
