class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> anagram = new HashMap<>();
        for (int k = 0; k < s.length(); k++)
            anagram.put(s.charAt(k), anagram.getOrDefault(s.charAt(k), 0) + 1);
        HashMap<Character, Integer> anagram2 = new HashMap<>();
        for (int k = 0; k < t.length(); k++)
            anagram2.put(t.charAt(k), anagram2.getOrDefault(t.charAt(k), 0 ) + 1);
        if (anagram.equals(anagram2))
            return true;
        else
            return false;
    }
}
