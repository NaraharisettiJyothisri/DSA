class Solution {
    public static int countDigits(int n) {
  int count =0;
  while(n>0){
        count = count+1;
        n=n/10;
    }
    return count;
  }
    
   public static void main(String[] args) {
        int n = 329823;
        System.out.println("n: " + n);
        int digits = countDigits(n);
        System.out.println("Number of Digits in n: " + digits);
    }
}