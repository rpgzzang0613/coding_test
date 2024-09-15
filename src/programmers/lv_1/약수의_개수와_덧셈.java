package programmers.lv_1;

public class 약수의_개수와_덧셈 {

    int left = 1;
    int right = 3;

    int result = solution(left, right);

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int cnt = 1;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(result);
    }
}
