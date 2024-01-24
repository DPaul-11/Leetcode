package Leetcode;

public class Jump_game_55 {
    public static void main(String[] args) {
        int nums[]={2,3,1,1,4};
        Jump_game_55 ob=new Jump_game_55();
        System.out.println(ob.canJump(nums));
    }
    public boolean canJump(int[] nums) {
        int jump=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(jump<nums[i])
            {
                jump=nums[i];
            }
            if(jump--==0)
            {
                return false;
            }
        }
        return true;
    }
}
