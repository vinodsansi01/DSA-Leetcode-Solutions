class Solution {
    public static boolean isPalindrome(int x) {
        int original = x;
        boolean isPalindrome = true;

        int reverse = 0;
       while(x>0){
        int ld = x%10;
        reverse = (reverse*10)+ld;
        x/=10;
       }
       return reverse == original;
    }

    public static void main(String args[]){
        int x = 121;

        System.out.println(isPalindrome(x));

    }
}