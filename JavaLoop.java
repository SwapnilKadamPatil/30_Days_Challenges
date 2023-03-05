package HackerRank_Day03;

import java.math.*;
import java.util.*; 

public class Solution {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        for(int i=1; i <=10; i++)
        {
            int result= N*i;
            System.out.printf("%d x %d =% d\n",N, i, result);
        }
    }
}


/*
Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/
