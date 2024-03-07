/*
Problem Description
You are given an array of integers A of length N and an integer B.

Return 1 if B is present in the array A, 0 otherwise.



Problem Constraints
1 <= N <= 105
1 <= Ai <= 109
1 <= B <= 109


Input Format
First argument is the integer array A.
Second argument is the integer B.


Output Format
Return 1 / 0, depending on the presence of B.


Example Input
Input 1:
A = [1, 4, 3, 2]
B = 2
Input 2:

A = [1, 4, 3, 2]
B = 5


Example Output
Output 1:
1
Output 2:

0


Example Explanation
Explanation 1:
2 is present in the array.
Input 2:

5 is not present in the array.
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
