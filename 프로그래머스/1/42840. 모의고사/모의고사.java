import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        // 수포자들의 찍는 방식 패턴
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] scores = new int[3];  // 각 수포자들의 점수를 저장할 배열
        
        // 정답 비교 및 점수 산정
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (answers[i] == patterns[j][i % patterns[j].length]) {  // 패턴을 순환하면서 정답과 비교
                    scores[j]++;
                }
            }
        }
        
        // 가장 높은 점수 계산
        int maxScore = Arrays.stream(scores).max().getAsInt();
        
        // 가장 많은 문제를 맞힌 수포자들 구하기
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                result.add(i + 1); // 수포자 번호는 1부터 시작하므로 인덱스에 1을 더함
            }
        }
        
        // 결과 배열로 변환
        int[] answerArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answerArray[i] = result.get(i);
        }
        
        return answerArray;
    }
}