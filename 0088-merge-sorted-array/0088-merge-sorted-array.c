void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    
    int i1 = 0,i2 = 0, i = 0;
    int temp[n+m];
    
    while(i1 < m && i2 < n ){
        if(nums1[i1] <= nums2[i2]){
            temp[i] = nums1[i1];
            i++;
            i1++;
        }
        else{
            temp[i] = nums2[i2];
            i++;
            i2++;
        }
        
    }
    
    if(i1 < m){
        while(i1 < m){
            temp[i] = nums1[i1];
            i++;
            i1++;
        }
    }
    if(i2 < n){
        while(i2<n){
             temp[i] = nums2[i2];
            i++;
            i2++;
        }
    }
    
    for(int j =0;j< n+m ;j++){
        nums1[j] = temp[j];
    }
    

}