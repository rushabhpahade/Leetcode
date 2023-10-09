// Find Length of Longest SubString present in String Which do not have duplicate Characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int current =0, max = 0;
        Set<Character> set = new HashSet<>();
        if(s.equals(" "))
        return 1;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max = Math.max(max, i-current+1);
            }
            else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(current));
                    current++;
                }
                set.add(s.charAt(i));
            }
        }
        return max;
    }
}