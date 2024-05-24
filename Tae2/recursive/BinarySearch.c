#include <stdio.h>

int binarysearch(int *arr, int left, int right, int value);

int main()
{
	int arr[10] = {1,3,5,6,7,8,9,10,23,30};
	int idx;

	idx = binarysearch(arr,0,9,23);
	if (idx == -1)
		printf("찾는 값은 없어요\n");
	else
		printf("%d index에 찾는값 있어요\n", idx);

	return 0;

}

int binarysearch(int *arr, int left, int right, int value)
{
	//중간 값 찾기
	int middle = (left+right)/2;
	
	// left가 right보다 커지는 순간에 없다
	if(left > right) return -1;


	if(arr[middle] == value)
	{
		return middle;
	}
	//중간 값이 찾고자 하는 값보다 작은 경우
	if(arr[middle] < value)
	{	
		//middle보다 큰 바운더리 안에 있으니까 middle + 1
		return binarysearch(arr,middle + 1, right, value);
	}
	else
	{
		//middle 보다 작은 바운더리 안에 있으니까 right = middle -1
		return binarysearch(arr, left, middle - 1, value);
	}
	
}
