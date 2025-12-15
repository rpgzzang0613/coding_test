package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class _2016년 implements ProgrammersQuiz {

    // 이렇게 내장 기능 갖다 쓰는게 코테 취지에 맞나 싶긴 한데..
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b)
                .getDayOfWeek()
                .getDisplayName(TextStyle.SHORT, Locale.US)
                .toUpperCase();
    }

    @Override
    public void execute() {
        int a = 5;
        int b = 24;

        String result = solution(a, b);

        System.out.println(result);
    }
}
