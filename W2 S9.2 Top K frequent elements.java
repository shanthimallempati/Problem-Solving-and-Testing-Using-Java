class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> freqMap.get(b) - freqMap.get(a)
        );

        pq.addAll(freqMap.keySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}
