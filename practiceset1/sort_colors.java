class sort_colors {
    public void sortColors(int[] nums) {
        
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i:nums){
            if(i==0)c0++;
            else if(i==1)c1++;
            else c2++;
        }
        int m=0;
        for(int i=0;i<c0;i++){
            nums[m++]=0;
        }
         for(int i=0;i<c1;i++){
            nums[m++]=1;
        }
         for(int i=0;i<c2;i++){
            nums[m++]=2;
        }
    }
}
