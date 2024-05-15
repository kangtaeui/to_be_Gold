int solution(int a, int b) {
    int answer = 0;
    //모두다 홀수인 경우
    if (a % 2 != 0 && b % 2 != 0)
    {
        answer = a*a + b*b;
    }
    //모두다 홀수가 아닌 경우
    else if (a % 2 == 0 && b % 2 == 0)
    {
        answer = a - b;
        if (answer < 0) answer = -answer;
    }
    //하나만 홀수인 경우
    else
    {
        answer = 2 * (a + b);
    }
    return answer;
}