class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int currsum=0;
       int window=Integer.MAX_VALUE;
       int st=0;
       int en=0;
       for(en=0;en<nums.length;en++)
       {
           currsum+=nums[en];
           while(currsum>=target)
           {
               window=Math.min(window,en-st+1);
               currsum-=nums[st];
               st++;
           }
       }
       if(window==Integer.MAX_VALUE)
       {
           window=0;
       }
       return window;
    }
}
