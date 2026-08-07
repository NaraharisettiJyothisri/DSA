class Solution{
    public int removeDuplicates(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
public static void main(String[] args) {
    int[] arr = {1,1,2,2,3,4,4};
  Solution s = new Solution();
        int ans = s.removeDuplicates(arr);

        System.out.println("Unique Count = " + ans);

        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        } 
}
}