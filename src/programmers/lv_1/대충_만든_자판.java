package programmers.lv_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 대충_만든_자판 {

    String[] keymap = {"AGZ", "BSSS"};
    String[] targets = {"ASA", "BGZ"};

    int[] result = solution(keymap, targets);

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<String, Integer> map = new HashMap<>();
        for(String s : keymap) {
            for(int i=0; i<s.length(); i++) {
                String key = String.valueOf(s.charAt(i));
                if(!map.containsKey(key) || map.get(key) > i) {
                    map.put(key, i);
                }
            }
        }

        for(int i=0; i<targets.length; i++) {
            int totalCnt = 0;

            boolean isPossible = true;

            for(char c : targets[i].toCharArray()) {
                if(map.get(String.valueOf(c)) != null) {
                    totalCnt += map.get(String.valueOf(c)) + 1;
                }else {
                    isPossible = false;
                    break;
                }
            }

            answer[i] = isPossible ? totalCnt : -1;
        }

        return answer;
    }

    public void showAnswers() {
        for(int i : result) {
            System.out.println(i);
        }
    }
}
