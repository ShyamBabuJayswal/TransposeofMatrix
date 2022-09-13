public class MCorssNmatrix {
    public static void matrix(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=arr[j][i];
            }
        }
           }
}
