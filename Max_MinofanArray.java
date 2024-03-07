public class Solution {
    public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++){
           if(max < A[i]){
            max = A[i];
           }

           if(min > A[i]){
            min =A[i];
           }
        }

        return max+min;
    }
}
