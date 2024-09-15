package programmers.lv_1;

public class 수박수박수박수박수박수 {
    int n = 9;

    String result = solution(n);

    public String solution(int n) {
        String answer = "수박".repeat(n / 2);

        if (n % 2 != 0) {
            answer = answer + "수";
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(result);
    }
}
