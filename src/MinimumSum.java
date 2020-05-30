import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //list.add(1);
        list.add(2);
        //list.add(1);

        int k = 1;
        System.out.println(minSum(list, k));

    }

    public static int minSum(List<Integer> num, int k) {
        if(num.size() == 1){
            return (int) Math.ceil(num.get(0)/2);
        }
        Collections.sort(num);
        int result = 0;
        for (int i = 1; i <= k; i++) {

            double replacing = num.get(num.size()-1);
            int half = (int)(Math.ceil(replacing/2));
            num.remove(num.get(num.size()-1));
            num.add(num.size()-1, half);
            Collections.sort(num);
        }
        for (int i = 0; i < num.size(); i++) {
            result += num.get(i);
        }

        return result;

    }

}

