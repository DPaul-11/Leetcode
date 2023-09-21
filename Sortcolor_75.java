package Leetcode;

public class Sortcolor_75 {
    public static void main(String[] args) {
        int[] nums={2,2,1,0,1,0};
       Sortcolor_75 ob=new Sortcolor_75();

    }
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]==0){
                z++;
            }else if(nums[i]==1){
                o++;
            }else{
                t++;
            }
        }
        int j=0;
        while(z>0){
            nums[j]=0;
            j++;
            z--;
        }
        while(o>0){
            nums[j]=1;
            j++;
            o--;
        }
        while(t>0){
            nums[j]=2;
            j++;
            t--;
        }

    }

}
