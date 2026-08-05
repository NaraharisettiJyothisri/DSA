class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = arr[0];
        int secondlargest = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
 public static void main(String[] args) {
    int arr[] = {6,7,8,4,3,2};
    Solution s = new Solution();
    System.out.println(s.getSecondLargest(arr));
}
}