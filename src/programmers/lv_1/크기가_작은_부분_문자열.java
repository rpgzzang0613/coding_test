package programmers.lv_1;

public class 크기가_작은_부분_문자열 {
    String t = "9322352";
    String p = "325";

    int result = solution(t, p);

    public int solution(String t, String p) {
        int answer = 0;

        int pLength = p.length();
        long pLong = Long.parseLong(p);

        for (int i = 0; i <= t.length() - pLength; i++) {
            int end = i + pLength;

            long substrLong = Long.parseLong(t.substring(i, end));

            if (substrLong <= pLong) {
                answer++;
            }
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(result);
    }

}
