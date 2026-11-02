class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        String freq;
        for (String str : strs) {
            int count[] = new int[26];
            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }
            freq = Arrays.toString(count);
            groups.computeIfAbsent(freq, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}
