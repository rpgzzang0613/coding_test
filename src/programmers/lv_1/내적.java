package programmers.lv_1;

public class 내적 {
    int[] a = {1, 2, 3, 4};
    int[] b = {-3, -1, 0, 2};

    int result = solution(a, b);

    public int solution(int[] a, int[] b) {
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }

        return result;
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
