class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        HashMap<Character, Integer> occurrences;
        for (String str : strs) {
            occurrences = getOccurrences(str);
            map.computeIfAbsent(occurrences, k -> new ArrayList<String>()).add(str);
        }
        for (ArrayList<String> value : map.values()) {
            result.add(value);
        }
        return result;
    }

    private HashMap<Character, Integer> getOccurrences(String data) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : data.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}