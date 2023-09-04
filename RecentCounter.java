public class RecentCounter {
    static int[] queue = new int[10000];
    int start = 0;
    int end = 0;
    
    public int ping(int t) {
        queue[end++] = t;

        while (queue[start] < t - 3000) {
            start++;
        }

        return end - start;
    }
}
