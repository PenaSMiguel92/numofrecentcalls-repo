import java.util.*;

public class RecentCounter {
    Deque<Integer> requests;

    public RecentCounter() {
        requests = new ArrayDeque<>();
    }

    public int ping(int t) {
        int count = 1;
        Iterator iterator = requests.descendingIterator();
        while (iterator.hasNext()) {
            int val = (int) iterator.next();
            if (val >= t - 3000 && val <= t)
                count++;
        }

        requests.offer(t);
        return count;
    }
}
