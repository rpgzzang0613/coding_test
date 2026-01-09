package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.HashMap;

public class 성격_유형_검사하기 implements ProgrammersQuiz {

    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> rtMap = new HashMap<>();
        rtMap.put('R', 0);
        rtMap.put('T', 0);

        HashMap<Character, Integer> cfMap = new HashMap<>();
        cfMap.put('C', 0);
        cfMap.put('F', 0);

        HashMap<Character, Integer> jmMap = new HashMap<>();
        jmMap.put('J', 0);
        jmMap.put('M', 0);

        HashMap<Character, Integer> anMap = new HashMap<>();
        anMap.put('A', 0);
        anMap.put('N', 0);

        for (int i = 0; i < choices.length; i++) {
            int choice = choices[i];

            int index = -1;
            int score = 0;

            if (choice > 4) {
                index = 1;
                score = choice - 4;
            } else if (choice < 4) {
                index = 0;
                score = 4 - choice;
            }

            if (index == -1) {
                continue;
            }

            char key = survey[i].charAt(index);
            if (rtMap.containsKey(key)) {
                rtMap.put(key, rtMap.get(key) + score);
            }
            if (cfMap.containsKey(key)) {
                cfMap.put(key, cfMap.get(key) + score);
            }
            if (jmMap.containsKey(key)) {
                jmMap.put(key, jmMap.get(key) + score);
            }
            if (anMap.containsKey(key)) {
                anMap.put(key, anMap.get(key) + score);
            }
        }

        return (rtMap.get('T') > rtMap.get('R') ? "T" : "R") +
                (cfMap.get('F') > cfMap.get('C') ? "F" : "C") +
                (jmMap.get('M') > jmMap.get('J') ? "M" : "J") +
                (anMap.get('N') > anMap.get('A') ? "N" : "A");
    }

    @Override
    public void execute() {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        String result = solution(survey, choices);

        System.out.println(result);
    }
}
