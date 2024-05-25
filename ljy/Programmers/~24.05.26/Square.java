// 문제 설명
// 이차원 정수 배열 arr이 매개변수로 주어집니다. arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고, 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

// 제한사항
// 1 ≤ arr의 길이 ≤ 100
// 1 ≤ arr의 원소의 길이 ≤ 100
// arr의 모든 원소의 길이는 같습니다.
// 1 ≤ arr의 원소의 원소 ≤ 1,000
// 입출력 예
// arr	result
// [[572, 22, 37], [287, 726, 384], [85, 137, 292], [487, 13, 876]]	[[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]
// [[57, 192, 534, 2], [9, 345, 192, 999]]	[[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], [0, 0, 0, 0]]
// [[1, 2], [3, 4]]	[[1, 2], [3, 4]]
// 입출력 예 설명
// 입출력 예 #1

// 예제 1번의 arr은 행의 수가 4, 열의 수가 3입니다. 행의 수가 더 많으므로 열의 수를 4로 만들기 위해 arr의 각 행의 끝에 0을 추가한 이차원 배열 [[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]를 return 합니다.
// 입출력 예 #2

// 예제 2번의 arr은 행의 수가 2, 열의 수가 4입니다. 열의 수가 더 많으므로 행의 수를 4로 만들기 위해 arr의 각 열의 끝에 0을 추가한 이차원 배열 [[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], [0, 0, 0, 0]]을 return 합니다.
// 입출력 예 #3

// 예제 3번의 arr은 행의 수와 열의 수가 2로 같습니다. 따라서 0을 추가하지 않고 [[1, 2], [3, 4]]을 return 합니다.

// 풀이 
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        
        int row = arr.length;
        int col = arr[0].length;
        
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        for (int i = 0; i < row; i++) { 
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for (int j = 0; j < col; j++) {
                tmp.add(arr[i][j]);
            }
            list.add(tmp);
        } // 여기까지가 arr > list로 옮기기
        
        if (row < col) { // arr에 [] 추가
            for (int i = 0; i < col - row; i++) {
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                for (int j = 0; j < col; j++) {
                    tmp.add(0);
                }
                list.add(tmp);
            }
        } else if (row > col) { // arr안의 배열에 0 추가
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row - col; j++) {
                    list.get(i).add(0);
                }
            }
        }
        
        int size = list.size(); // 여기부터 다시 int[][]로 변환
        answer = new int[size][];
        for (int i = 0; i < size; i++) {
            answer[i] = new int[size];
            for (int j = 0; j < size; j++) {
                answer[i][j] = list.get(i).get(j);
            }
        }
        
        return answer;
    }
}