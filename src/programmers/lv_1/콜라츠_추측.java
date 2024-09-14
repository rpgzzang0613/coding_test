package programmers.lv_1;

public class 콜라츠_추측 {
    int num = 6;

    int result = solution(num);

    public int solution(int num) {
        if (num == 1) {
            return 0;
        }

        long numL = num;

        int cnt = 0;
        while (numL != 1) {
            cnt++;

            if (numL % 2 == 0) {
                numL /= 2;
            } else {
                numL = numL * 3 + 1;
            }

            if (cnt == 500) {
                return -1;
            }
        }

        return cnt;
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
