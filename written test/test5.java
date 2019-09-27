import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Welcome to vivo ! 输入m,n, n个人, 是m的倍数出列, 报数一遍结束接着队尾的继续报数.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int input[] = parseInts(inputStr.split(" "));
        String output = solution(input);
        System.out.println(output);
    }

    private static int[] parseInts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    private static String solution(int[] input) {
        if (input == null || input.length == 0) {
            return null;
        }
        ArrayList left = new ArrayList<Integer>();
        ArrayList fin = new ArrayList<Integer>();
        for (int i = 1; i <= input[0]; i++) {
            left.add(i);
        }
        arrange(1, left, input[1], fin);
        int[] array = new int[fin.size()];
        for (int k = 0; k < fin.size(); i++) {
            array[k] = fin.get(k);
        }
        return Arrays.toString(array);
    }

    public static int count = 1;

    public static ArrayList arrange(int index, ArrayList left, int num, ArrayList fin) {
        for (int i = index; i <= left.size(); i++) {
            if (i % num == 0) {
                fin.add(i);
                left.set(i, 0);
            }
            if (i == array.length) {
                for (int j = 0; j < left.size(); j++) {
                    if (left.get(j) == 0) {
                        left.remove(j);
                    }
                    count = count + i;
                    arrange(count, left, num, fin);
                }
            }
        }
        return fin;
    }

}