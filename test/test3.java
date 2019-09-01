import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int[] num = new int[a];
            int[] numCopu=num.clone();
            ArrayList sig = new ArrayList<String>();
            for (int i = 0; i < 2 * a - 1; i++) {
                if (i % 2 == 0) {
                    num[i / 2] = scanner.nextInt();
                } else {
                    sig.add(scanner.next());
                }
            }
            int temp = 0;
            for (int i = 1; i < a; i++) {
                if(numCopu[i-1]>numCopu[i]){
                    temp = numCopu[i - 1];
                    numCopu[i - 1] = numCopu[i + 1];
                    numCopu[i + 1] = temp;
                    for (int j = 0; j < a-1; j++) {
                        if(sig.get(j).equals("+")){
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(num) + "" + sig.size());
        }
    }
}