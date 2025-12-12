package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 핸드폰_번호_가리기 implements ProgrammersQuiz {

    public String solution(String phone_number) {
        if (phone_number.length() == 4) {
            return phone_number;
        }

        int fullLength = phone_number.length();
        int markLength = fullLength - 4;

        return "*".repeat(markLength) + phone_number.substring(markLength);
    }

    @Override
    public void execute() {
        String phone_number = "01066767422";

        String result = solution(phone_number);

        System.out.println(result);
    }

}
