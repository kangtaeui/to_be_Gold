#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    vector<int> answer;
    vector<int> temp;
    
    for(int i=0; i<queries.size(); i++)
    {
        int s = queries[i][0];
        int e = queries[i][1];
        int k = queries[i][2];
        int min = 1000001;
        bool flag = false;
        
        for(int j = s; j <= e ; j++)
        {
           if (arr[j] < min && arr[j] > k)
           {
               min = arr[j];
               flag = true;
           }
        }
        if(!flag) answer.push_back(-1);
        if(flag)
        {
            answer.push_back(min);
            flag = false;
        }
    }
    return answer;
}
