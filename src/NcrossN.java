public class NcrossN {
    public static void reverse(int[][] arr){
        int m=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
