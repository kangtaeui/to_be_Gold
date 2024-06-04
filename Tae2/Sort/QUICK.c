#include <stdio.h>
#include <stdlib.h>
#pragma warning(disable : 4996)

int arr[10] = { 3, 1, 7, 5, 5, 2, 6, 4, 8 };


void Quick(int *arr, int left, int right)
{
    int PL = left;
    int PR = right;
    int Pivot = arr[(left + right) / 2];
    do
    {
        while (Pivot > arr[PL]) PL++;
        while (Pivot < arr[PR]) PR--;

        if (PL <= PR)
        {
            int temp = arr[PL];
            arr[PL] = arr[PR];
            arr[PR] = temp;
            PL++;
            PR--;   //크로스를 위해
        }
    } while (PL <= PR); //크로스 될 때까지 == PIVOT 이상과 이하로 나눠진다.

    if (left < PR)  //1개 남을때가지
    {
        Quick(arr, left, PR);
    }
    
    if (right > PL) //1개 남을떄까지 재귀
    {
        Quick(arr, PL, right);
    }
}

int main() {
    int num = sizeof(arr) / sizeof(arr[0]);
    Quick(arr, 0, num - 1);

    for (int i = 0; i < num; i++)
    {
        printf("%d  ", arr[i]);
    }
    return 0;
}
