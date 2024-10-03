package programmers.lv_1;

public class 시저_암호 {
    String s = "xyz";

    String result = solution(s, 3);

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                if ('Z' >= c + n) {
                    answer.append((char) (c + n));
                } else {
                    answer.append((char) ('A' + (c + n - 'Z' - 1)));
                }
            } else if ('a' <= c && c <= 'z') {
                if ('z' >= c + n) {
                    answer.append((char) (c + n));
                } else {
                    answer.append((char) ('a' + (c + n - 'z' - 1)));
                }
            }  else {
                answer.append(' ');
            }
        }

        return answer.toString();
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
