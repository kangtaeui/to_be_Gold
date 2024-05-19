@RequestMapping(value="/insertSort", method=RequestMethod.GET)
public void InsertSort() {
  List<Integer> numList = new ArrayList<Integer>(Arrays.asList(4, 5, 1, 3, 2)); // 정렬을 하기 위한 배열
  
  System.out.println("정렬 전 " + numList); // 4, 5, 1, 3, 2
  
  for (int i = 1; i < numList.size(); i++) {
    for (int j = i; j > 0; j--) {
      if (numList.get(j) < numList.get(j - 1)) {
        int tmp = numList.get(j);
        numList.set(j, numList.get(j - 1));
        numList.set(j - 1, tmp);	
      }
    }
  }
  
  System.out.println("정렬 후 " + numList); // 오름차순 선택 정렬
}