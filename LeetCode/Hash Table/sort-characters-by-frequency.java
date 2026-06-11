// https://leetcode.com/problems/sort-characters-by-frequency/


class Solution {
    public String frequencySort(String s) {
         HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        while (!hm.isEmpty()) {

            char maxChar = ' ';
            int maxFreq = 0;

            for (char k : hm.keySet()) {
                if (hm.get(k) > maxFreq) {
                    maxFreq = hm.get(k);
                    maxChar = k;
                }
            }

            for (int i = 0; i < maxFreq; i++) {
                ans.append(maxChar);
            }

            hm.remove(maxChar);
        }
   return ans.toString();
    }
}
