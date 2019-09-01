import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList rArrayList=new ArrayList<>();
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            for(int i =m; i<=n;i++){
                int b=i/100;
                int s=(i-b*100)/10;
                int g=i-b*100-s*10;
                if((Math.pow(b, 3)+ Math.pow(s, 3)+ Math.pow(g, 3))==i){
                    rArrayList.add(i);
                }
            }
            if (rArrayList.size() == 0) {
                System.out.println("no");
            } else {
                rArrayList.forEach(obj->System.out.print(obj));
            }
        }
    }
}