#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#define size 5

int arr[size] = { 5,4,3,2,1 };

int main()
{
	for (int i = 0; i < size-1; i++)
	{
		int temp = 0;
		for (int j = i + 1; j > 0 && j < 5; j--)
		{
			
			if (arr[j] < arr[j - 1])
			{
				temp = arr[j-1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	for (int i = 0; i < size; i++)
	{
		printf("%d \t", arr[i]);
	}
}
