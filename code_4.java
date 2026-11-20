class Solution {
public:
    int maxSelectedElements(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int mx = nums.back() + 2;
        vector<int> dp(mx + 1, 0);
        int ans = 0;

        for (int x : nums) {
            dp[x + 1] = dp[x] + 1;      // raise x to x+1
            dp[x]     = dp[x - 1] + 1;  // keep x as is
            ans = max({ans, dp[x], dp[x + 1]});
        }
        return ans;
    }
};
