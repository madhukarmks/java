#include<bits/stdc++.h>
using namespace std;

class solution{
    public:
    vector<vector<int>> threeSum(vector<int>val)
    {
        int n=val.size();
        vector<vector<int>>ans;
        
        set<vector<int>>s;
        
        for(int i=0; i<n; i++)
        {
            for(int j=i+1;j<n; j++)
            {
                for(int k=j+1;k<n; k++)
                {
                    if((val[i]+val[j]+val[k])==0)
                    {
                        vector<int>trip={val[i],val[j],val[k]};
                        
                        sort(trip.begin(),trip.end());
                        
                        if(s.find(trip)==s.end())
                        {
                            s.insert(trip);
                            ans.push_back(trip);
                        }
                    }
                }
            }
        }
        return ans;
    }
};


int main()
{
     vector<int>val={2,-2,0,3,-3,5};
    solution s;
   vector<vector<int>>ans=s.threeSum(val);
   for(auto& row:ans)
   {
       for(int a:row)
       {
           cout<<a<<" ";
       }
       cout<<endl;
   }
    
}
