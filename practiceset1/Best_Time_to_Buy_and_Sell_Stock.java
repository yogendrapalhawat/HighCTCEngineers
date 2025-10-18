class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int buy=prices[0];
        for(int i:prices){
            if(buy<i){
                int p=i-buy;
                maxp=Math.max(p,maxp);
            }
            else{
                buy=i;
            }
        }
        return maxp;
        
    }
}
