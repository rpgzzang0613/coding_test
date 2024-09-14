package programmers.lv_1;

import java.util.Stack;

public class 카드_뭉치 {

    String[] cards1 = {"i", "water", "drink"};
    String[] cards2 = {"want", "to"};
    String[] goal = {"i", "want", "to", "drink", "water"};

    String result = solution(cards1, cards2, goal);

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        Stack<String> cardStack1 = new Stack<>();
        Stack<String> cardStack2 = new Stack<>();

        for (int i = cards1.length -1; i >= 0; i--) {
            cardStack1.push(cards1[i]);
        }

        for (int i = cards2.length -1; i >= 0; i--) {
            cardStack2.push(cards2[i]);
        }

        for(String s : goal) {
            if (!cardStack1.isEmpty() && cardStack1.peek().equals(s)) {
                cardStack1.pop();
            } else if (!cardStack2.isEmpty() && cardStack2.peek().equals(s)) {
                cardStack2.pop();
            } else {
                answer = "No";
                break;
            }
        }

        return answer;
    }

    public void showAnswers() {
        System.out.println(result);
    }
}
