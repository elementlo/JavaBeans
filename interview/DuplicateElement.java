package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * DuplicateElement 找出数组中重复的数字。 在一个长度为n的数组里的所有数字都在0~n1的范围内。数组中某
 * 些数字是重复的,但不知道有几个数字重复了,也不知道每个数字重复了 几次。请找出数组中任意一个重复的数字。
 * 例如,如果输入长度为7的数组{2,3,1,0,2,5,3},那么对应的输出是重复的数字2或者3。
 */
public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        while(scanner.hasNext()){
            for (int i = 0; i <n; i++) {
                a[i]=scanner.nextInt();
            }
            Arrays.sort(a);
            for (int i = 1; i < n; i++) {
                if (a[i]==a[i-1]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}