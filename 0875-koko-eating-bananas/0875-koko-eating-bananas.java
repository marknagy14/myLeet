class Solution {
    public int minEatingSpeed(int[] piles, int h) {
            int high = findMax(piles);
            int l=1;
            int mid,result=0;

            while(l<=high){
                mid = (l+high)/2;
                if(check(piles,h,mid)){
                    high=mid-1;
                    result=mid;
                }
                else{
                    l = mid+1;
                }


            }

        return result;
    }




    public boolean check(int[] piles, int h, int k){
        if(k ==0)return false;
        int i = 0;
        while(h>=0 && i<piles.length){

            h -=Math.ceil((double)piles[i]/k);
            i++;
        }
        return (h>=0 && i == piles.length);
    }

    public int findMax(int[]piles){

        int max=piles[0];
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;

    }



}