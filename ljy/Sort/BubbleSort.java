@RequestMapping(value="/bubbleSort", method=RequestMethod.GET)
public void BubbleSort() {
  List<Integer> numList = new ArrayList<Integer>(Arrays.asList(4, 5, 1, 3, 2)); // 정렬을 하기 위한 배열
  
  System.out.println("정렬 전 " + numList); // 4, 5, 1, 3, 2
  
  for (int i = numList.size(); i >= 0; i--) {
    for (int j = 1; j < i; j++) {
      if (numList.get(j - 1) > numList.get(j)) {
        int tmp = numList.get(j);
        numList.set(j, numList.get(j - 1));
        numList.set(j - 1, tmp);	
      }
    }
  }
  
  System.out.println("정렬 후 " + numList); // 오름차순 버블 정렬
}