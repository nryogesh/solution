class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
List<Integer> res = new ArrayList<>();
int i = num.length - 1; // Starts at index 3 (last element)

while (i >= 0 || k > 0) {
    if (i >= 0) {
        k += num[i];
        i--;
    }
    res.add(k % 10);
    k /= 10;
}

Collections.reverse(res);
return res;

       
    }
}