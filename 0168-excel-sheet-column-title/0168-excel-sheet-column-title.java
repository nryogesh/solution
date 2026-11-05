class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder a = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; 
            int b = columnNumber % 26;
            char c = (char) ('A' + b);
            a.append(c);
            columnNumber /= 26;
        }
        
        return a.reverse().toString();
    }
}
