package programmers.lv_1;

import java.util.Stack;

public class 서울에서_김서방_찾기 {

    String[] seoul = {"Kim", "Baek"};

    String result = solution(seoul);

    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                return "김서방은 "+i+"에 있다";
            }
        }

        return null;
    }

    public void showAnswers() {
        System.out.println(result);
    }
}
