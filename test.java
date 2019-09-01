import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sum = 0;
        double temp = a;
        while(scanner.hasNext()){
            
        }
        for (int i = 0; i < b; i++) {
            if(i==0){
                sum=a;
                continue;
            }
            temp = Math.sqrt(temp);
            sum += temp;
        }
        System.out.print(String.format("%.2f", sum));
    }
}