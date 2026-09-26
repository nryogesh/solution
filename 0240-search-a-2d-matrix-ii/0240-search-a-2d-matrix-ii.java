
        
        class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int r=0;
        int c=arr[0].length-1;
        

        while(r<arr.length && c>=0){
            // r=2 c=1

            if(target==arr[r][c]){
                return true;

        }
        if(target<arr[r][c]){
            c--;
        }
        else{
            r++;
        }
        }
        return false;
    }
}
  