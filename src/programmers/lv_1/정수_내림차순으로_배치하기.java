package programmers.lv_1;

public class 정수_내림차순으로_배치하기 {

    long n = 118372L;

    long result = solution(n);

    public long solution(long n) {
        char[] nCharArr = String.valueOf(n).toCharArray();

        for (int i = 0; i < nCharArr.length; i++) {
            for (int j = 0; j < nCharArr.length - i; j++) {
                if (j + i + 1 == nCharArr.length) {
                    continue;
                }

                if (nCharArr[j] < nCharArr[j + 1]) {
                    char tmp = nCharArr[j];
                    nCharArr[j] = nCharArr[j + 1];
                    nCharArr[j + 1] = tmp;
                }
            }
        }

        return Long.parseLong(new String(nCharArr));
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
