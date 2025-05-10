package java_LC.interview.leetcode.arrays.dynamicisland;


/*
 * Given an 2D array, find the number of islands
 * 
 * 1 0 1 1 1
 * 1 0 0 0 1
 * 1 1 1 1 1
 * 1 0 1 1 1
 * 
 * answer = 2
 */
public class ArraysDynamicIslandSubstitue {
    public static void main(String[] args) {
        int [][]marray = {
            {1,0,1,1,1},
            {1,0,1,0,1},
            {1,1,0,1,1},
            {1,0,1,1,1}
        };
        int m=4,n=5;
        int counter=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(marray[i][j]==0){
                    reccursivelySubstitue(i,j,m,n,marray);
                    counter++;
                }
            }
        }
        System.out.println("Number of dynamic Islands are "+counter);
    }

    private static void reccursivelySubstitue(int i, int j, int m, int n, int[][] marray) {
        if(marray[i][j]==0){
            marray[i][j]=-1;
        }
        else return;
        if(i-1>=0)
            reccursivelySubstitue(i-1, j, m, n, marray);
        if(i+1<m)
            reccursivelySubstitue(i+1, j, m, n, marray);
        if(j-1>=0)
            reccursivelySubstitue(i, j-1, m, n, marray);
        if(j+1<n)
            reccursivelySubstitue(i, j+1, m, n, marray);
    }

    

}
