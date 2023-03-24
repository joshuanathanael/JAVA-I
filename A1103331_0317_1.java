import java.util.*;

public class A1103331_0317_1 {
    public static void main(String [] argv){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = scan.nextInt();

        System.out.print("Please input m: ");
        int m = scan.nextInt();

        int[][] Arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               Arr[i][j]=(i+1)*(j+1);
               
            }
        }
        for(int[] array : Arr){
            for(int value : array){
                System.out.print(value+" ");

            }
            System.out.println();
        }
    }
}