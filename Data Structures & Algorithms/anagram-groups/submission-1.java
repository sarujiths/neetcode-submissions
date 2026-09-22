class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }
            String key = Arrays.toString(count);
            group.computeIfAbsent(key, k -> new ArrayList<String>()).add(str);
        }
        return new ArrayList<>(group.values());
    }
}