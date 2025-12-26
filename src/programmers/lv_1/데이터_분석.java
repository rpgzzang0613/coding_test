package programmers.lv_1;

import programmers.ProgrammersQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 데이터_분석 implements ProgrammersQuiz {

    // data: 코드 번호(code), 제조일(date), 최대 수량(maximum), 현재 수량(remain)
    // data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        List<int[]> tmpList = new ArrayList<>();

        for (int[] row : data) {
            int indexForFilter = titleToIndex(ext);
            int val = row[indexForFilter];
            if (val < val_ext) {
                tmpList.add(row);
            }
        }

        int indexForSort = titleToIndex(sort_by);
        tmpList.sort(Comparator.comparingInt(a -> a[indexForSort]));

        return tmpList.toArray(answer);
    }

    private int titleToIndex(String code) {
        return switch (code) {
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };
    }

    @Override
    public void execute() {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        int[][] result = solution(data, ext, val_ext, sort_by);

        System.out.println(Arrays.deepToString(result));
    }
}
