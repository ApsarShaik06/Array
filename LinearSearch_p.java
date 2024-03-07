/*
You are given an array of integers A of length N and an integer B.

Return 1 if B is present in the array A, 0 otherwise.
*/
public class Solution {
    public int linearSearch(int[] A, int B) {

        for(int i=0; i<A.length; i++){
            if(A[i] == B){
                return 1;
            }
        }

        return 0;
    }
}
