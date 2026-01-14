package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 개인정보_수집_유효기간 implements ProgrammersQuiz {

    public int[] solution(String today, String[] terms, String[] privates) {
        List<Integer> answer = new ArrayList<>();

        HashMap<String, Integer> termMap = new HashMap<>();
        for (String t : terms) {
            String[] tArr = t.split(" ");
            termMap.put(tArr[0], Integer.parseInt(tArr[1]));
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        for (int i = 0; i < privates.length; i++) {
            String p = privates[i];
            String[] pArr = p.split(" ");
            String date = pArr[0];
            String term = pArr[1];

            int expireMonth = termMap.get(term);
            LocalDate expiredDate = LocalDate.parse(date, dtf).plusMonths(expireMonth);
            if (!LocalDate.parse(today, dtf).isBefore(expiredDate)) {
                answer.add(i + 1);
            }
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    @Override
    public void execute() {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privates = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        int[] result = solution(today, terms, privates);

        System.out.println(Arrays.toString(result));
    }
}
