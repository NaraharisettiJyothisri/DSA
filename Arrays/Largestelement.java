class Solution {
    public static int largest(int[] arr) {
        // code here
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

public static void main(String[] args) {

    int[] arr = {5, 50, 3, 100};

    System.out.println(largest(arr));

}
}