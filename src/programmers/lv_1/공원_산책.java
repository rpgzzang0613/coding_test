package programmers.lv_1;

import java.util.HashMap;

public class 공원_산책 {

    String[] park = {"SOO","OXX","OOO"};

    String[] routes = {"E 2","S 2","W 1"};

    int[] result = solution(park, routes);

    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        final int MAX_H = park.length;
        final int MAX_W = park[0].length();

        int currentH = 0;
        int currentW = 0;

        for(int i=0; i<park.length; i++) {
            if(park[i].contains("S")) {
                currentH = i;
                currentW = park[i].indexOf("S");
                break;
            }
        }

        for(String route : routes) {
            String direction = route.split(" ")[0];
            int length = Integer.parseInt(route.split(" ")[1]);

            boolean isInRange = checkRange(direction, length, currentH, currentW, MAX_H, MAX_W);
            if(!isInRange) {
                continue;
            }

            boolean isPossibleToGo = checkPossibleToGo(direction, length, currentH, currentW, park);
            if(!isPossibleToGo) {
                continue;
            }

            if(direction.equals("E") || direction.equals("W")) {
                if(direction.equals("W")) {
                    length = -length;
                }

                currentW += length;
            }else {
                if(direction.equals("N")) {
                    length = -length;
                }

                currentH += length;
            }

        }

        answer[0] = currentH;
        answer[1] = currentW;

        return answer;
    }

    private boolean checkRange(String direction, int length, int currentH, int currentW, int maxH, int maxW) {
        boolean isInRange = false;

        if(direction.equals("E") || direction.equals("W")) {
            if(direction.equals("W")) {
                length = -length;
            }

            if(currentW + length >= 0 && currentW + length <= maxW-1) {
                isInRange = true;
            }
        }else {
            if(direction.equals("N")) {
                length = -length;
            }

            if(currentH + length >= 0 && currentH + length <= maxH-1) {
                isInRange = true;
            }
        }

        return isInRange;
    }

    private boolean checkPossibleToGo(String direction, int length, int currentH, int currentW, String[] park) {
        boolean isPossibleToGo = true;

        for(int i=1; i<=length; i++) {
            char symbol;
            switch(direction) {
                case "E":
                    symbol = park[currentH].charAt(currentW + i);
                    break;
                case "W":
                    symbol = park[currentH].charAt(currentW - i);
                    break;
                case "S":
                    symbol = park[currentH + i].charAt(currentW);
                    break;
                default:
                    symbol = park[currentH - i].charAt(currentW);
                    break;
            }

            if(symbol == 'X') {
                isPossibleToGo = false;
                break;
            }
        }

        return isPossibleToGo;
    }

    public void showAnswers() {
        for(int i : result) {
            System.out.println(i);
        }
    }
}
