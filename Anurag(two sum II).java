class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum=0;
        int ans[]=new int[2];
        int start=0;
        int end=numbers.length-1;
        while(start<end)
        {
            if(numbers[start]+numbers[end]>target)
            {
                end--;
            }
            else if(numbers[start]+numbers[end]<target)
            {
                start++;
            }
            else
            {
                ans[0]=start+1;
                ans[1]=end+1;
                break;
            }
        }
        return ans;
        
    }
}
