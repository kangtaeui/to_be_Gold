#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>


int solution(int a, int d, bool included[], size_t included_len) {
    int answer = 0;
    for (int i = 0; i < included_len; i++)
    {
        if (included[i] == true)
        {
            answer += a + (d * i); //초항에 인덱스 항만큼 곱한 공차값을 더해주면 그 인덱스에 해당하는 값일테니 true일때만 그값들을 다 더해준다.
        }
    }
    return answer;
}
