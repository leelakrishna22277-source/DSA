// https://leetcode.com/problems/toeplitz-matrix/

class Solution {

   public boolean checkDiagonal(int[][] matrix,int x,int y){
    int r=matrix.length;
    int c=matrix[0].length; 
    boolean issame=true;
    int i=x;
    int j=y;
    int prev=matrix[i][j];
    while(i<r && j<c){
           if(prev!=matrix[i][j]){
               issame=false;
               break;
           }
           i++;j++;
       }
       return issame;
           
   }

    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean issame=true;
          int r=matrix.length;
    int c=matrix[0].length;
       for(int j=0;j<c;j++){
        //    System.out.println(mat[0][j]);
        boolean temp=checkDiagonal(matrix,0,j);
        if(temp==false){
            issame=false;
        }
       }
       for(int i=1;i<r;i++){
        //    System.out.println(mat[i][0]);
        boolean temp=checkDiagonal(matrix,i,0);
        if(temp==false){
            issame=false;
        }

       }
       
       return issame;
    }
}

// class Solution {
//     public boolean isToeplitzMatrix(int[][] matrix) {
//         int n=matrix.length,m=matrix[0].length;
//         for(int i=0;i<n-1;i++){
//           for(int j=0;j<m-1;j++){
//             if(matrix[i][j]!=matrix[i+1][j+1])
//             return false;
//           }
//         }
//         return true;
//     }
// }
