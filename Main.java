import java.util.*;

public class Main {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        List<Integer> res = new ArrayList<>();
        res.add(null);
        int t = 0;
        while (t < 3500) {
            if (t == 1) {
                int param = obj.ping(t);
                res.add(param);
            }
            if (t == 100) {
                int param = obj.ping(t);
                res.add(param);
            }
            if (t == 3001) {
                int param = obj.ping(t);
                res.add(param);
            }
            if (t == 3002) {
                int param = obj.ping(t);
                res.add(param);
            }

            t++;
        }
        Integer[] resArray = res.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(resArray));
    }
}
