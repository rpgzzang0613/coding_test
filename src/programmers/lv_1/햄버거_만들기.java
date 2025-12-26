package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.Stack;

public class 햄버거_만들기 implements ProgrammersQuiz {

    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> burger = new Stack<>();

        for (int i : ingredient) {
            burger.push(i);
            if (burger.size() >= 4
                    && burger.get(burger.size() - 4) == 1
                    && burger.get(burger.size() - 3) == 2
                    && burger.get(burger.size() - 2) == 3
                    && burger.get(burger.size() - 1) == 1) {

                answer++;

                burger.pop();
                burger.pop();
                burger.pop();
                burger.pop();
            }
        }

        return answer;
    }

    @Override
    public void execute() {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        int result = solution(ingredient);

        System.out.println(result);
    }
}
