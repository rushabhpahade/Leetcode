//Find All Anagrams in a String
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       if(p.length()>s.length())
       {
           return new ArrayList<>();
       } 
       HashMap<Character,Integer> hme = new HashMap<>();

       for(int i=0;i<p.length();i++){
           char ch = p.charAt(i);
           hme.put(ch,hme.getOrDefault(ch,0)+1);
       } 

       HashMap<Character,Integer> hms = new HashMap<>();
       int matchCount=0;

       for(int i=0;i<p.length();i++){
           char ch = s.charAt(i);
           hms.put(ch,hms.getOrDefault(ch,0)+1);

           if(hms.get(ch)<= hme.getOrDefault(ch,0)){
               matchCount++;
           }
       }
       List<Integer> list = new ArrayList<>();
       if(matchCount == p.length()){
           list.add(0);
       }
        int sp =0;
        int ep = p.length();

        while(ep<s.length()){
            char chs = s.charAt(sp);
            char che  = s.charAt(ep);

            hms.put(che,hms.getOrDefault(che,0)+1);
            if(hms.get(che)<= hme.getOrDefault(che,0)){
                matchCount++;
            }
            hms.put(chs,hms.get(chs)-1);
            if(hms.get(chs)<hme.getOrDefault(chs,0))
            matchCount--;
            sp++;
            ep++;
            if(matchCount == p.length()){
                list.add(sp);
            }
        }
        return list;
    }
}