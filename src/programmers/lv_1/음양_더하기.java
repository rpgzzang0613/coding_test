package programmers.lv_1;

public class 음양_더하기 {
    int[] absolutes = {4, 7, 12};
    boolean[] signs = {true, false, true};

    int result = solution(absolutes, signs);

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(result);
    }
}
