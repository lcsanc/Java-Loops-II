/*Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use , , and  to produce some series :

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use , , and  to produce some series :

We then print each element of our series as a single line of space-separated values.*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        //t is the number that the loop will repeat
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            //a repeats in every sentence so it doesn't have to be in the formula
            int b = in.nextInt();
            // b multiplies the exponent in the formula 
            int n = in.nextInt();
            // n is the number that the formula will repeat 
            int x =a + ((int)Math.pow(2,0)) * b; 
            int y =0;
            int z =0;
            
            System.out.print(x+" "); 
                        
            for(int j=1; j<n; j++)
            {
               y = ((int)Math.pow(2,j)) * b;
               //System.out.println(" ' " + y +  " ' " );
               z = x + y; 
               System.out.print(z+" ");
               x = z;                
               //System.out.println(" ' " + z + " ' "); 
            }
            System.out.println();
        }
        in.close();
    }
}