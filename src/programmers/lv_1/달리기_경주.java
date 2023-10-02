package programmers.lv_1;

import java.util.HashMap;

public class 달리기_경주 {

    String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    String[] callings = {"kai", "kai", "mine", "mine"};
    String[] result = solution(players, callings);

    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerMap = new HashMap<>();
        HashMap<Integer, String> rankMap = new HashMap<>();
        for(int i=0; i<players.length; i++) {
            playerMap.put(players[i], i);
            rankMap.put(i, players[i]);
        }

        for(int i=0; i<callings.length; i++) {
            String calledPlayer = callings[i];
            int calledRank = playerMap.get(calledPlayer);

            int prevRank = calledRank - 1;
            String prevPlayer = rankMap.get(prevRank);

            rankMap.put(prevRank, calledPlayer);
            rankMap.put(calledRank, prevPlayer);
            playerMap.put(calledPlayer, prevRank);
            playerMap.put(prevPlayer, calledRank);

            String tmpStr = players[calledRank];
            players[calledRank] = players[prevRank];
            players[prevRank] = tmpStr;
        }

        return players;
    }

    public void showAnswers() {
        for(String s : result) {
            System.out.println(s);
        }
    }


}
