package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.HashMap;

public class 완주하지_못한_선수 implements ProgrammersQuiz {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> peopleMap = new HashMap<>();

        for (String p : participant) {
            if (peopleMap.containsKey(p)) {
                peopleMap.put(p, peopleMap.get(p) + 1);
            } else {
                peopleMap.put(p, 1);
            }
        }

        for (String c : completion) {
            if (peopleMap.containsKey(c)) {
                peopleMap.put(c, peopleMap.get(c) - 1);
            }
        }

        for (String k : peopleMap.keySet()) {
            if (peopleMap.get(k) > 0) {
                answer = k;
                break;
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String result = solution(participant, completion);

        System.out.println(result);
    }
}
