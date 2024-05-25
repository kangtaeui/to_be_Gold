@RequestMapping(value="/selectSort", method=RequestMethod.GET)
public void SelectSort() {
  List<Integer> numList = new ArrayList<Integer>(Arrays.asList(4, 5, 1, 3, 2)); // 정렬을 하기 위한 배열
  
  System.out.println("정렬 전 " + numList); // 4, 5, 1, 3, 2	
  
  for (int i = 0; i < numList.size() - 1; i++) {
    
    int min = numList.get(i);
    int minI = i;
    
    for (int j = i; j < numList.size(); j++) {
      if (numList.get(j) < min) {
        min = numList.get(j);
        minI = j;
      }
    }
    
    int tmp = numList.get(i);
    numList.set(i, min);
    numList.set(minI, tmp);
  }

  System.out.println("정렬 후 " + numList); // 오름차순 선택 정렬
}