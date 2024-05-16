#include <stdio.h>
#include <stdlib.h>

#pragma warning (disable : 4996)

#if 1
#define size 5
int Select[size];
int main()
{
	int num;
	int first;
	printf("버블 정렬을 짜겠습니다\n");
	printf("숫자 5개를 입력해주세요! :");
	for (int i = 0; i < size; i++)
	{
		scanf("%d", &num);
		Select[i] = num;
	}

	for (int i = 0; i < size; i++)
	{
		first = Select[i];
		for (int j = i+1; j < size; j++)
		{
			if (first > Select[j])
			{
				first = Select[i];
				Select[i] = Select[j];
				Select[j] = first;
			}
		}
	}
	for (int i = 0; i < 6; i++)
	{
		printf("%d\t", Select[i]);
	}
}
#endif
