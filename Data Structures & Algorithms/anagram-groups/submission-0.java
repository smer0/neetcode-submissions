class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <HashMap<Character, Integer>, List<String>> words = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            HashMap <Character, Integer> letterGroup = new HashMap<>();
            String currentWord = strs[i];

            for (int j = 0; j < currentWord.length(); j++) {
                letterGroup.put(currentWord.charAt(j), letterGroup.getOrDefault(currentWord.charAt(j), 0) + 1); }

            if (words.containsKey(letterGroup)){
            words.get(letterGroup).add(strs[i]); }
            
            else {
            List<String> newGroup = new ArrayList<String>();
            newGroup.add(strs[i]);
            words.put(letterGroup, newGroup); }
        }
        List<List<String>> returnington = new ArrayList<>(words.values());
        return returnington;
    }
    }
    

