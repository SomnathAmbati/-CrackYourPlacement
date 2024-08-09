class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        Map<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> stack = new Stack<>();

        for (int num : n2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        int[] result = new int[n1.length];
        for (int i = 0; i < n1.length; i++) {
            result[i] = map.getOrDefault(n1[i], -1);
        }

        return result;
    }
}
