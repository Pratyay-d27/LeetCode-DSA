import java.util.*;

class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {

        TreeSet<Integer> available = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            available.add(i);
        }

        // Min-heap ordered by [end_time, server_id]
        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0])
                                   : Integer.compare(a[1], b[1])
        );

        int[] count = new int[k];

        for (int i = 0; i < arrival.length; i++) {
            int curTime = arrival[i];

            // Free up all servers whose tasks have finished by 'curTime'
            while (!busy.isEmpty() && busy.peek()[0] <= curTime) {
                int[] free = busy.poll();
                available.add(free[1]);
            }

            // If no servers are available at all, the request is dropped
            if (available.isEmpty()) {
                continue;
            }

            // Find the assigned server based on (i % k) using a circular search
            int preferredServer = i % k;
            
            // Look for the first available server >= preferredServer
            Integer assignedServer = available.ceiling(preferredServer);
            
            // If none found >= preferredServer, wrap around to the absolute lowest ID
            if (assignedServer == null) {
                assignedServer = available.first();
            }

            // 4. Mark the server as busy and update execution counts
            available.remove(assignedServer);
            count[assignedServer]++;
            busy.offer(new int[] { curTime + load[i], assignedServer });
        }

        int maxRequests = 0;
        for (int c : count) {
            maxRequests = Math.max(maxRequests, c);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (count[i] == maxRequests) {
                result.add(i);
            }
        }

        return result;
    }
}
