class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double a=0;
       for(int i=1;i<salary.length-1;i++){
        a=a+salary[i];

       }
        return a/ (salary.length-2);
    }
}