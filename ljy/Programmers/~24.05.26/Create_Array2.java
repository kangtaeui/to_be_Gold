// 문제 설명
// 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

// 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

// 제한사항
// 1 ≤ l ≤ r ≤ 1,000,000
// 입출력 예
// l	r	result
// 5	555	[5, 50, 55, 500, 505, 550, 555]
// 10	20	[-1]
// 입출력 예 설명
// 입출력 예 #1

// 5 이상 555 이하의 0과 5로만 이루어진 정수는 작은 수부터 5, 50, 55, 500, 505, 550, 555가 있습니다. 따라서 [5, 50, 55, 500, 505, 550, 555]를 return 합니다.
// 입출력 예 #2

// 10 이상 20 이하이면서 0과 5로만 이루어진 정수는 없습니다. 따라서 [-1]을 return 합니다.


// 풀이
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = new int[]{-1}; // 아닐 경우는 그냥 -1이 담긴 배열 반환
        
        int start = l - (l % 5);
        
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = start; i <= r; i = i + 5) {
            String str = "" + i;
            
            boolean cor = true; // 숫자에 0이나 5만 있는지 판단
            for (int j = 0; j < str.length(); j++) {
                if (!str.substring(j, j+1).equals("5") && !str.substring(j, j+1).equals("0")) { // 한 자리라도 0이나 5가 아니면 찾아냄
                    cor = false;
                }
            }
            
            if (cor) { // 0과 5로만 구성되어있으면 list에 담기
                list.add(i);
            }
        } 
        
        if (list.size() > 0) {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }

    // 이진수를 활용할 생각
    // answer은 삼항 연산자를 이용해 코드 줄이기
}