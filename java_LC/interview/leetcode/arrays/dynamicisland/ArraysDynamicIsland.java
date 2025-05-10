package java_LC.interview.leetcode.arrays.dynamicisland;

import java.util.HashSet;
import java.util.Set;

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
public class ArraysDynamicIsland {

    record point(int i, int j){};

    public static void main(String[] args) {
        int [][]marray = {
            {1,0,1,1,1},
            {1,0,1,0,1},
            {1,1,0,1,1},
            {1,0,1,1,1}
        };
        Set<point> pointlist = new HashSet<>();
        int counter=0;
        int m=4, n=5;
        for(int i=0; i < m; i++){
            for(int j=0; j<n; j++){
                boolean found = false;
                found = hasPoint(i,j,pointlist);
                if(!found){
                    if(marray[i][j]==0){
                        reccursivelyAddPoints(i,j,m,n,marray,pointlist);
                        counter++;
                    }
                }
            }
        }
        System.out.println("Number of dynamic islands are "+counter);
    }

    private static boolean hasPoint(int i, int j, Set<point> pointlist) {
        return pointlist.stream().filter(p->p.i==i&&p.j==j).count()>0;
    }

    private static void reccursivelyAddPoints(int i, int j, int m, int n, int[][] marray, Set<point> pointlist) {
        if(marray[i][j]==0){
            pointlist.add(new point(i,j));
        }else return;

        if(i+1<m && !hasPoint(i+1,j,pointlist)) 
            reccursivelyAddPoints(i+1, j, m, n, marray, pointlist);
        if(i-1>=0 && !hasPoint(i-1,j,pointlist))
            reccursivelyAddPoints(i-1, j, m, n, marray, pointlist);
        if(j+1<n && !hasPoint(i,j+1,pointlist))
            reccursivelyAddPoints(i, j+1, m, n, marray, pointlist);
        if(j-1>=0 && !hasPoint(i,j-1,pointlist))
            reccursivelyAddPoints(i, j-1, m, n, marray, pointlist);
    }
}
