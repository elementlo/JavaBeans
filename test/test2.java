import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] array=new int[m][n];
            int[] max=new int[n];
            int maxi=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    array[i][j]=scanner.nextInt();
                }
            }
            int j=0;
            for (j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    if(array[i][j]>maxi){
                        maxi=array[i][j];
                    }
                }
                max[j]=maxi;
            }
            int sum=0;
            for(int i =0;i<max.length;i++){
                sum+=max[i];
            }
            System.out.println(sum);
        }
    }
}