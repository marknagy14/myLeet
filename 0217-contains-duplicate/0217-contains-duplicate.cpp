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

/* knowing that inserting elements in a set
removes the dupilcates, so
-insert elements of vector in a set
-compare size of vector to size of set
-if they are equal return false(no dupicates)
-return true
*/
