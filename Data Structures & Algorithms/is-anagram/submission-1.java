class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = getOccurrences(s);
        HashMap<Character, Integer> map2 = getOccurrences(t);
        return map1.equals(map2);
    }

    private HashMap<Character, Integer> getOccurrences(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}
