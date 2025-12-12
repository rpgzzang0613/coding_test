package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 삼진법_뒤집기 implements ProgrammersQuiz {

    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }

        char[] charArr = sb.toString().toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            int intValue = charArr[i] - '0';

            int indexReversed = charArr.length - i - 1;

            answer += (int) (intValue * Math.pow(3, indexReversed));
        }

        return answer;
    }

    @Override
    public void execute() {
        int n = 99999999;

        int result = solution(n);

        System.out.println(result);
    }

}
