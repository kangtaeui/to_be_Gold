#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool divide(int x)
{
    int hashard = x;
    int position = 0;
    int ans = 0;
    bool possible = false;
    while(x != 0)
    {
        position = x%10;
        x /= 10;
        ans += position;
    }
    return (hashard % ans == 0)? possible = true : false;
}

bool solution(int x) 
{
    bool answer = true;
    answer = divide(x);
    return answer;
}
