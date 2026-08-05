class Sorted {
    public boolean isSorted(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
    int[] arr = {1,5,2,3,4};
    Sorted s = new Sorted();
    System.out.println(s.isSorted(arr));
}
}