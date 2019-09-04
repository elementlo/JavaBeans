import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * JobSelecting 网易笔试 题目描述
 * 为了找到自己满意的工作，牛牛收集了每种工作的难度和报酬。
 * 牛牛选工作的标准是在难度不超过自身能力值的情况下，牛牛选择报酬最高的工作。
 * 在牛牛选定了自己的工作后，牛牛的小伙伴们来找牛牛帮忙选工作，牛牛依然使用自己的标准来帮助小伙伴们。
 * 牛牛的小伙伴太多了，于是他只好把这个任务交给了你。
 * 输入描述: 
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
 * 接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
 * 接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。 保证不存在两项工作的报酬相同。 
 * 输出描述:
 * 对于每个小伙伴，在单独的一行输出一个正整数表示他能得到的最高报酬。一个工作可以被多个人选择。
 */
public class JobSelecting {
    public static void main(String[] args) {
        List jobList = new ArrayList<JobItem>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] goal = new int[m];
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            int p = scanner.nextInt();
            jobList.add(new JobSelecting().new JobItem(d, p));
        }
        Collections.sort(jobList, Collections.reverseOrder());

        for (int i = 0; i < m; i++) {
            goal[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < jobList.size(); j++) {
                if (goal[i] >= ((JobItem) (jobList.get(j))).d) {
                    goal[i] = ((JobItem) (jobList.get(j))).p;
                    break;
                }
            }
        }
        Arrays.stream(goal).forEach(System.out::println);
    }

    class JobItem implements Comparable {
        public int d = 0;
        public int p = 0;

        public JobItem(int d, int p) {
            this.d = d;
            this.p = p;
        }

        @Override
        public int compareTo(Object jobItem) {
            return p - ((JobItem)jobItem).p;
        }

    }
}
