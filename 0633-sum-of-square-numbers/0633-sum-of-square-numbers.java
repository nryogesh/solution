class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long)Math.sqrt(c);
        long sum=0;
            while(i<=j){
                sum=(i*i)+(j*j);
            
            if(sum>c){
                 j--;}

            else if(sum<c){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}