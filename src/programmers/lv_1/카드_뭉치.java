package programmers.lv_1;

import java.util.HashMap;

public class 카드_뭉치 {

    String[] cards1 = {"i", "drink", "water"};
    String[] cards2 = {"want", "to"};
    String[] goal = {"i", "want", "to", "drink", "water"};

    String result = solution(cards1, cards2, goal);

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        HashMap<String, Integer> cardMap1 = new HashMap<>();
        HashMap<String, Integer> cardMap2 = new HashMap<>();
        for(int i=0; i<cards1.length; i++) {
            cardMap1.put(cards1[i], i+1);
        }
        for(int i=0; i<cards2.length; i++) {
            cardMap2.put(cards2[i], i+1);
        }

        for(String s : goal) {
            if(cardMap1.containsKey(s)) {

            }else if(cardMap2.containsKey(s)) {

            }
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(result);
    }
}
