package programmers.lv_1;

public class 자릿수_더하기 {
    int n = 534;

    int result = solution(n);

    public int solution(int n) {
        int answer = 0;

        String nStr = String.valueOf(n);
        for (char c : nStr.toCharArray()) {
            answer += c - '0';
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
