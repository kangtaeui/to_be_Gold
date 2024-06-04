#include <stdio.h>
#include <stdlib.h>
#pragma warning(disable : 4996)

int arr[10] = { 1, 9, 4, 5, 2, 6, 7, 0, 3, 8 };

void merge(int* arr, int* arrMerge, int left, int middle, int right) {
    int idx1 = left;
    int idx2 = middle + 1;
    int idx = left;

    for (int i = left; i <= right; i++) {
        arrMerge[i] = arr[i];  // left와 right를 넣어준다.
    }

    while (idx1 <= middle && idx2 <= right) {
        if (arrMerge[idx1] > arrMerge[idx2]) {
            arr[idx++] = arrMerge[idx2++];
        }
        else {
            arr[idx++] = arrMerge[idx1++];
        }
    }

    //나머지 값 넣어주기
    while (idx1 <= middle) {
        arr[idx++] = arrMerge[idx1++];
    }
    while (idx2 <= right) {
        arr[idx++] = arrMerge[idx2++];
    }
}

void divide(int* arr, int* arrMerge, int left, int right) {
    if (left < right) {
        int middle = (left + right) / 2;
        divide(arr, arrMerge, left, middle);
        divide(arr, arrMerge, middle + 1, right);
        merge(arr, arrMerge, left, middle, right);
    }
}

int main() {
    int num = sizeof(arr) / sizeof(arr[0]);  // 요소의 개수를 계산
    int* arrMerge = (int*)malloc(sizeof(int) * num);
  
    divide(arr, arrMerge, 0, num - 1);

    for (int i = 0; i < num; i++) {
        printf("%d  ", arr[i]);
    }
    free(arrMerge);
    return 0;
}
