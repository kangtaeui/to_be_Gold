#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// included_len�� �迭 included�� �����Դϴ�.
int solution(int a, int d, bool included[], size_t included_len) {
    int answer = 0;
    for (int i = 0; i < included_len; i++)
    {
        if (included[i] == true)
        {
            answer += a + (d * i);
        }
    }
    return answer;
}