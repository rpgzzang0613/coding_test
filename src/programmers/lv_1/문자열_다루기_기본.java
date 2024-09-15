package programmers.lv_1;

public class 문자열_다루기_기본 {
    String s = "a1245";

    boolean result = solution(s);

    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        char[] cArr = s.toCharArray();
        for (char c : cArr) {
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
