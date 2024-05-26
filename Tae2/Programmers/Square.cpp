#include <string>
#include <vector>


using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr) {
    vector<vector<int>> answer;
    int row = arr.size();
    int col = arr[0].size();
    int gap = row - col;
    if(gap<0) gap =-gap;
    
    
    if(row > col)
    {
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<gap; j++)
            {
                arr[i].push_back(0);
            }
        }
    }
    else if (col > row)
    {
        vector<int> a;
        for (int i=0; i<col; i++)
        {
            a.push_back(0);
        }
        for (int j=0; j<gap; j++)
        {
            arr.push_back(a);
        }
    }
    return arr;
}
    
