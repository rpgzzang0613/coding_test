package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 하샤드_수 implements ProgrammersQuiz {

    public boolean solution(int x) {
        String xStr = String.valueOf(x);
        if (xStr.length() == 1) {
            return true;
        }

        int plusOne = 0;
        for (char c : xStr.toCharArray()) {
            plusOne += c - '0';
        }

        return x % plusOne == 0;
    }

    @Override
    public void execute() {
        int x = 24234;

        boolean result = solution(x);

        System.out.println(result);
    }

}
