class Solution {
public:
 int maxProfit(vector<int>& prices) {
    int l=0,r;
    int max=0;
    
for( r=l+1;r<prices.size();r++){
    if(prices[l]>=prices[r]){
        l=r;
        continue;
    }
    else{
        if(prices[r]-prices[l]>max)
            max=prices[r]-prices[l];
    }
}
     return max;
     
}
};