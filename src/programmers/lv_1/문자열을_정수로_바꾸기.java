package programmers.lv_1;

public class 문자열을_정수로_바꾸기 {
    String s = "-1234";

    int result = solution(s);

    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
