#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* order[], size_t order_len) {
    int answer = 0;
    bool N;
    for (int i = 0; i < order_len; i++)
    {
        for (int j = 0; order[i][j] != '\0'; j++)
        {
            if (order[i][j] == 'n')
            {
                answer += 4500;
                break;
            }
            else if (order[i][j + 1] == '\0' && order[i][j] != 'n')
            {
                answer += 5000;
            }
        }
    }
    return answer;
}