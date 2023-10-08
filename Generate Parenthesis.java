class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        generatePara(str,n,0,0,"");
        return str;   
    }
    public void generatePara(List<String> str,int n,int s,int e,String output){
        if(output.length() == n*2){
            str.add(output);
            return;
        }
        if(s<n){
            generatePara(str,n,s+1,e,output+"(");
        }
        if(e<s){
            generatePara(str,n,s,e+1,output+")");
        }
    }
}