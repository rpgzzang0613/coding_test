package programmers.lv_1;

public class 가운데_글자_가져오기 {

    String s = "DFKS";

    String result = solution(s);

    public String solution(String s) {
        if (s.length() == 1) {
            return s;
        }

        int len = s.length();

        if (len % 2 != 0) {
            return String.valueOf(s.charAt(len/2));
        } else {
            return String.valueOf(s.charAt(len/2 - 1)) + s.charAt(len / 2);
        }
    }

    public void showAnswers() {
        System.out.println(result);
    }
}
