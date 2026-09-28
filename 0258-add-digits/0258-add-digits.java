class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }

        
        while(num/10!=0){
            int n=num%10;
            int m=num/10;
            int sum=n+m;
            num=sum;
        }
        return num;
    }
}