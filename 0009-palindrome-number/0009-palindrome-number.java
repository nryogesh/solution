class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x); 
        String b = new StringBuilder(str).reverse().toString(); 
        if(str.equals(b)){
            return true;
        }
        return false;
    }
}