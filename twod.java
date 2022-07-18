public class twod{
    public static void main(String[] args) {
        int twoD [] [] = new int [4] [5];
        int i, j, k = 0;
        for(i = 0; i<4; i++)
          for (j=0; j<5; j++){
            twoD[i] [j] = k;
            k++;
          }

        for(i=0; i<4; i++){
          for(j=0; j<5; j++)
            System.out.println(twoD[i] [j] + " ");
        System.out.println();
        }
    }
    
}

/*Output
0 
1 
2
3
4

5
6
7
8
9

10
11
12
13
14

15
16
17
18
19
 */
