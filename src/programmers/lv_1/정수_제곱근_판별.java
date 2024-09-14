package programmers.lv_1;

public class 정수_제곱근_판별 {
    long n = 118372L;

    long result = solution(n);

    public long solution(long n) {
        long answer = -1L;

        double sqrt = Math.sqrt(n);
        if (sqrt == (int) sqrt) {
            int plusOne = (int) sqrt + 1;
            answer = (long) plusOne * plusOne;
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
