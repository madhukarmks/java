#include<bits/stdc++.h>
using namespace std;

class solution {
    
    public:
    
    int subArary(vector<int>&nums,int k)
    {
        int n=nums.size();
        int sum=0;
        int max_length=0;
        unordered_map<long long,int>mp;
        
        for(int j=0; j<n; j++)
        {
           sum+=nums[j];
           if(sum==k)
           max_length=j+1;
           
           if(mp.find(sum-k)!=mp.end())
           max_length=max(max_length,j-mp[sum-k]);
           
           if(mp.find(sum-k)==mp.end())
           mp[sum]=j;
        }
        return max_length;
    }
};

int main()
{
    solution s;
    vector<int>val={10,5,2,7,1,9};
    cout<<s.subArary(val,15);
}
