package programmers.lv_1;

public class 나머지가_1이_되는_수_찾기 {
    int n = 32;

    int result = solution(n);

    public int solution(int n) {
        if (n % 2 == 0) {
            return 1;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return n-1;
    }

    public void showAnswers() {
        System.out.println(result);
    }
}
