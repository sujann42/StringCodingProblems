import java.util.*;

public class MinSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(7);
        //list.add(1);

        int k = 4;
        System.out.println(minSum(list, k));
    }

    public static int minSum(List<Integer> num, int k) {
        int finalSum = 0;
        Queue<Integer> pq = new PriorityQueue<>(num.size(), Comparator.reverseOrder());
        pq.addAll(num);
        while (k > 0) {
            k--;
            int newNum = (int) Math.ceil(pq.poll() / 2.0);
            pq.add(newNum);
        }
        finalSum = pq.stream().mapToInt(totalSum -> totalSum).sum();
        return pq.stream().mapToInt(i -> i).sum();
    }
}
