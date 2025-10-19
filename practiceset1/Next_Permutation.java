class  Next_Permutation {
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int nums[],int st,int end){
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int gola_index=-1;
        for(int i=n-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                gola_index=i-1;
                break;
            }
        }
        if(gola_index!=-1){
        int swap_index=gola_index;
        for(int i=n-1;i>gola_index;i--){
            if(nums[i]>nums[gola_index]){
                swap_index=i;
                break;
            }
        }
        swap(nums,gola_index,swap_index);
      
        }
          reverse(nums,gola_index+1,n-1);
        
    }
}
