// Question name = Largest Number At Least Twice of Others
// Link for Question = https://leetcode.com/problems/largest-number-at-least-twice-of-others/
// Solution is starting form here ⇩

class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int smax = -1;
        int ans = 0;
        if(nums.length==1) return 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] >= max ){
                smax = max;
                max = nums[i];
                ans = i;
            }
            else if(nums[i]>=smax){
                smax=nums[i];
            }
        }
        // System.out.println(max +" , "+ smax);
        ans = max>=2*smax?ans:-1;
        return ans;
    }
}

// The end of solution 
// This code has been written by Sohit Kushwaha (Linkedin=> https://www.linkedin.com/in/sohitkushwaha/)
//  Github => https://github.com/itsmesohit
// followed by Pepcoding's Interview preparation batch instructed by Subhesh Sir (Linkedin => https://www.linkedin.com/in/subhu9/); 