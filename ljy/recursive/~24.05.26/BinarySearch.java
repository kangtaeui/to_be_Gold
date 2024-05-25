import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class BinarySearch {
	public static void main(String[] args) {
		System.out.println("Binary Search Started");
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i < 11; i++) {
			list.add(i);
		} // 배열에 숫자 담기
		
		Random ran = new Random();
		int findVal = ran.nextInt(20) + 1; // 찾으려 하는 값
		System.out.println("findVal = " + findVal);

		int returnVal = BinarySearch(findVal, 0, list.size() - 1, list);

		if (returnVal != -1) {
			System.out.println("========= found, index : " + returnVal + "=========");
		} else {
			System.out.println("========= couldn't find =========");
		}
	}

	public static int BinarySearch(int val, int startIndex, int endIndex, List<Integer> list) {
		if (val < list.get(startIndex) || val > list.get(endIndex)) {
			return -1;
		} else {
			int halfIndex = startIndex + (int)((endIndex - startIndex) / 2);
			int halfVal = list.get(halfIndex);
			System.out.println("halfIndex : " + halfIndex + ", findVal : " + val + ", halfVal : " + halfVal);

			if (val == halfVal) {
				System.out.println("equal");
				return halfIndex;
			} else if (val < halfVal) {
				System.out.println("less");
				return BinarySearch(val, startIndex, halfIndex - 1, list);
			} else {
				System.out.println("Greater");
				return BinarySearch(val, halfIndex + 1, endIndex, list);
			}
		}
	}
}
