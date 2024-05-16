#include <stdio.h>
#include <stdlib.h>

#pragma warning (disable : 4996)

#if 1
int Bubble[10];
int main()
{
	int num;
	printf("버블 정렬을 짜겠습니다\n");
	printf("숫자 5개를 입력해주세요! :");
	for (int i = 0; i < 6; i++)
	{
		scanf("%d", &num);
		Bubble[i] = num;
	}
	
	for (int i = 0; i < 6; i++)
	{
		int temp = 0;
		for (int j = 0; j < 6 - i - 1; j++)
		{
			if (Bubble[j] > Bubble[j + 1])
			{
				temp = Bubble[j + 1];
				Bubble[j + 1] = Bubble[j];
				Bubble[j] = temp;
			}
		}
	}

	for (int i = 0; i < 6; i++)
	{
		printf("%d\t", Bubble[i]);
	}
}

#endif
