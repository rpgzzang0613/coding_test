package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.HashMap;

public class 추억_점수 implements ProgrammersQuiz {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> missMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            missMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[i] += missMap.get(photo[i][j]) != null ? missMap.get(photo[i][j]) : 0;
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        String[] name = {"kali", "mari", "don"};
        int[] yearing = {11, 1, 55};
        String[][] photo = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};

        int[] result = solution(name, yearing, photo);

        for (int i : result) {
            System.out.println(i);
        }
    }

}
