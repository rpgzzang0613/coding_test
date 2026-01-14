package programmers.lv_1;

import programmers.ProgrammersQuiz;

public class 유연근무제 implements ProgrammersQuiz {

    // schedules: 직원별로 설정한 출근시각 (700 -> 7:00)
    // timelogs: 직원별 실제 출근시각
    // startday: 이벤트가 시작되는 요일 (1: 월)
    // 일주일동안 자신이 설정한 출근 희망 시각 + 10분까지 어플로 출근해야 함
    // 주말 출근 시각은 이벤트에 영향을 주지 않음
    // 평일 출근시 지각을 하지 않은 직원들만 이벤트 대상
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;

        String[] WEEKS = {"월", "화", "수", "목", "금", "토", "일"};

        for (int i = 0; i < schedules.length; i++) {
            int startSetTime = schedules[i];
            int[] oneLogs = timelogs[i];
            for (int j = 0; j < oneLogs.length; j++) {
                String week = WEEKS[(startday + j - 1) % 7];
                if (week.equals("토") || week.equals("일")) {
                    continue;
                }

                int logMin = oneLogs[j] / 100 * 60 + oneLogs[j] % 100;
                int startMin = startSetTime / 100 * 60 + startSetTime % 100;

                if (logMin > startMin + 10) {
                    answer--;
                    break;
                }
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        int[] schedules = {700, 800, 1100};
        int[][] timelogs = {{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}};
        int startday = 5;

        int result = solution(schedules, timelogs, startday);

        System.out.println(result);
    }

}
