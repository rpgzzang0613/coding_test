package programmers.lv_1;

public class 문자열_내림차순으로_배치하기 {
    String s = "diDCqslcw";

    String result = solution(s);

    public String solution(String s) {
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr.length - i; j++) {
                if (j + i + 1 == charArr.length) {
                    continue;
                }

                if (charArr[j] < charArr[j + 1]) {
                    char tmp = charArr[j];
                    charArr[j] = charArr[j + 1];
                    charArr[j + 1] = tmp;
                }
            }
        }

        return new String(charArr);
    }

    public void showAnswers() {
        System.out.println(result);
    }
}
