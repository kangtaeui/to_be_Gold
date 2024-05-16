#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(int a, int b, int c, int d) {
    int answer = 0;
    //벡터 초기화
    vector<int> v = { a,b,c,d };
    //정렬
    sort(v.begin(), v.end());

    //모두 다 같은경우
    if (v[0] == v[3]) return answer = (1111 * v[0]);

    //세개가 같은 경우
    else if (v[0] == v[2]) return answer = (10 * v[0] + v[3]) * (10 * v[0] + v[3]);
    else if (v[1] == v[3]) return answer = (10 * v[1] + v[0]) * (10 * v[1] + v[0]);

    //앞의 두개만 같은 경우
    else if (v[0] == v[1])
    {
        if (v[2] == v[3])
        {
            return answer = (v[0] + v[2]) * abs(v[0] - v[2]);
        }
        else if (v[2] != v[3])
        {
            return answer = v[2] * v[3];
        }
    }
    //중간의 두개만 같은 경우
    else if (v[1] == v[2])
    {
        if (v[0] == v[3])
        {
            return answer = (v[1] + v[0]) * abs(v[1] - v[0]);
        }
        else if (v[0] != v[3])
        {
            return answer = v[0] * v[3];
        }
    }

    //뒤의 두개만 같은 경우
    else if (v[2] == v[3])
    {
        if (v[0] == v[1])
        {
            return answer = (v[2] + v[0]) * abs(v[2] - v[0]);
        }
        else if (v[0] != v[1])
        {
            return answer = v[0] * v[1];
        }
    }

    //모두 다 다른 경우 정렬해놧으니 가장 작읍 값 v[0]를 return
    return answer = v[0];
    
}
