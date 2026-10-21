class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);
        visited[0] = true;

        int count = 1;

        while (!queue.isEmpty()) {
            int room = queue.poll();

            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    visited[key] = true;
                    count++;
                    queue.offer(key);
                }
            }
        }

        return count == rooms.size();
    }
}