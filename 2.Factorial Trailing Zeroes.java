class Solution {
    public int trailingZeroes(int n) {
        // int b=n/5;
        // return b;
        int count=0;
        while(n>0){
            n/=5;
            count+=n;

        }
        return count;
    }
}
