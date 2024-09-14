package programmers.lv_1;

public class 문자열_내_p와_y의_개수 {
    String s = "pPoooyY";

    boolean result = solution(s);

    public boolean solution(String s) {
        boolean answer = true;

        int fullCnt = s.length();
        int pCnt = fullCnt - s.toLowerCase().replace("p", "").length();
        int yCnt = fullCnt - s.toLowerCase().replace("y", "").length();

        if (fullCnt > pCnt || fullCnt > yCnt) {
            if (pCnt != yCnt) {
                answer = false;
            }
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
