package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 숫자_짝꿍 implements ProgrammersQuiz {

    public String solution(String X, String Y) {
        int[] xCountArr = new int[10];
        int[] yCountArr = new int[10];

        for (char c : X.toCharArray()) {
            xCountArr[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            yCountArr[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int repeat = Math.min(xCountArr[i], yCountArr[i]);

            if (repeat > 0) {
                sb.append(String.valueOf(i).repeat(repeat));
            }
        }

        String strForUse = sb.toString();
        if (strForUse.isEmpty()) {
            return "-1";
        }

        if (strForUse.charAt(0) == '0') {
            return "0";
        }

        return strForUse;
    }

    @Override
    public void execute() {
        String X = "5525";
        String Y = "1255";

        String result = solution(X, Y);

        System.out.println(result);
    }
}
