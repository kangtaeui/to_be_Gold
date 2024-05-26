#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

//판단하기위한 함수
int input(int num) {
    while(num) {
        int a = num % 10;
        num /= 10;
        if(a == 0 || a == 5) continue;
        return 0;
    }
    return 1;
}
int* solution(int l, int r) {
    int* answer = (int*)malloc(100 * sizeof(int));
    int idx = 0;
    for(int i = l; i <= r; i++) {
        if(input(i)) answer[idx++] = i;
    }
  //size 재할당
    if(idx==0) answer[0] = -1, idx = 1;
    

    answer = (int*)realloc(answer, idx * sizeof(int));
    return answer;
}
