#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int add(int n)
{
    int position = 0;
    int ans = 0;
    while(n != 0)
    {
        position = n % 10;
        n /= 10;
        ans += position;
    }
    return ans;
}

int solution(int n) 
{
    int answer = 0;
    answer = add(n);
    return answer;
}
