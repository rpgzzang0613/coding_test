package programmers.lv_1;

public class 하샤드_수 {
    int x = 24234;

    boolean result = solution(x);

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

    public void showAnswers() {
        System.out.println(result);
    }

}
