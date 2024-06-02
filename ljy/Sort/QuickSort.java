import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class QuickSort {
	public static List<Integer> arr = new ArrayList<Integer>(Arrays.asList(4, 5, 1, 3, 2, 6, 7, 10, 9)); // 정렬을 하기 위한 배열
	
  public static void main(String[] args) {
    System.out.println("정렬 전 : " + arr);

    QuickSort(0, arr.size() - 1);

    System.out.println("정렬 후 : " + arr);
	}

  public static void QuickSort(int start, int end) {
    if (start >= end) { // 무한루프 방지
      return;
    }

    int pivot = MakePivot(start, end);
    QuickSort(start, pivot - 1);
    QuickSort(pivot + 1, end);
  } 

  public static int MakePivot(int start, int end) {
    int pivot = arr.get(end); // 우선 피벗을 끝으로 설정

    for (int i = start; i < end; i++) {
      if (arr.get(i) <= pivot) { // 피벗보다 작은 수는 왼쪽으로 몰면서 start를 증가시켜 0에 놓고, 1에 놓고... 큰 수는 그 자리에 두기
        int tmp = arr.get(i);
        arr.set(i, arr.get(start));
        arr.set(start, tmp);
        start++;
      }
    } 

    int tmp = arr.get(end); 
    arr.set(end, arr.get(start));
    arr.set(start, tmp); // 피벗을 중간으로 이동, 작은 수를 왼쪽으로 두고 큰 수를 오른쪽에 두기

    return start; // 피벗의 인덱스 반환
  }
}
