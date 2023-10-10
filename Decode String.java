// Decode String // Input: s = "2[abc]3[cd]ef"  Output: "abcabccdcdcdef"
class Solution {
    public String decodeString(String s) {
        Stack<Integer> numst = new Stack<>();
        Stack<StringBuilder> st = new Stack<>();
        int n = s.length() ,num=0;
        StringBuilder str = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch>='0' && ch<='9'){
                num = (num*10) + ch -'0';
            }
            else if(ch =='['){
                  st.push(str);
                  str = new StringBuilder();
                  numst.push(num);
                  num=0;  
            }
            else if(ch==']'){
                   StringBuilder temp = str;
                   str = st.pop();
                   int count = numst.pop();
                   while(count-->0){
                       str.append(temp);
                   }
            }
            else    str.append(ch);
       }
       return str.toString();
    }
}