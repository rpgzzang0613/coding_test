package programmers.lv_1;

public class 핸드폰_번호_가리기 {

    String phone_number = "01066767422";

    String result = solution(phone_number);

    public String solution(String phone_number) {
        if (phone_number.length() == 4) {
            return phone_number;
        }

        int fullLength = phone_number.length();
        int markLength = fullLength - 4;

        return "*".repeat(markLength) + phone_number.substring(markLength);
    }

    public void showAnswers() {
        System.out.println(result);
    }
}
