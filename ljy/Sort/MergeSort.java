import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class MergeSort {
	public static void main(String[] args) {
		List<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 6, 8));
    List<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1, 2, 6, 7, 10));
    List<Integer> mergeArr = new ArrayList<Integer>();

    System.out.println("arr1 : " + arr1);
    System.out.println("arr2 : " + arr2);

    mergeArr = MergeSort(arr1, arr2);

    System.out.println("mergeArr : " + mergeArr);
	}

  public static List<Integer> MergeSort(List<Integer> arr1, List<Integer> arr2) {
    List<Integer> mergeArr = new ArrayList<Integer>();
    int p1 = 0, p2 = 0;

    while (p1 < arr1.size() && p2 < arr2.size()) {
        if (arr1.get(p1) <= arr2.get(p2)) {
            mergeArr.add(arr1.get(p1++));
        } else {
            mergeArr.add(arr2.get(p2++));
        }
    }

    while (p1 < arr1.size()) {
        mergeArr.add(arr1.get(p1++));
    }

    while (p2 < arr2.size()) {
        mergeArr.add(arr2.get(p2++));
    }

    return mergeArr;
  }
}
