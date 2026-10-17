class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int remainingDays = n % 7;
        int total = 28 * weeks + 7 * (weeks * (weeks - 1)) / 2;
        int firstDayOfRemaining = weeks + 1;
        int lastDayOfRemaining = weeks + remainingDays;
        total += remainingDays * (firstDayOfRemaining + lastDayOfRemaining) / 2;
        
        return total;
    }
}
