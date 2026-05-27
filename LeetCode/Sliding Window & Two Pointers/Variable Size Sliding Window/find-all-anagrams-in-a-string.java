// https://leetcode.com/problems/find-all-anagrams-in-a-string/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
         HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            hm1.put(p.charAt(i),
                    hm1.getOrDefault(p.charAt(i), 0) + 1);
        }

        int l = 0;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int r = 0; r < s.length(); r++) {

            hm2.put(s.charAt(r),
                    hm2.getOrDefault(s.charAt(r), 0) + 1);

            if (r - l + 1 > p.length()) {

                char ch = s.charAt(l);

                hm2.put(ch, hm2.get(ch) - 1);

                if (hm2.get(ch) == 0) {
                    hm2.remove(ch);
                }

                l++;
            }

            if (hm1.equals(hm2)) {
                temp.add(l);
            }
        }
        return temp;
    }
}
