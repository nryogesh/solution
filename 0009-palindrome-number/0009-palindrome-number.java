class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x); 
        String b = new StringBuilder(str).reverse().toString(); 
        return(str.equals(b));
          
    }
}