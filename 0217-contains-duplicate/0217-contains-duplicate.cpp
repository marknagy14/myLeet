#include <set>

class Solution {
public:
   bool containsDuplicate(std::vector<int>& nums) {
    std::set<int> tags;
    for(auto n:nums){
        tags.insert(n);
    }
    if(tags.size()==nums.size()){
        return false;
    }
    return true;

}
};