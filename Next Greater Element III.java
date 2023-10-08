// Next Greater Element III
class Solution {
    public int nextGreaterElement(int n) {
        char[] number = (n+"").toCharArray();        
        int i;
        for(i=number.length-1;i>0;i--)
        {
            if(number[i] > number[i-1])
            break;
        }
        if(i==0)
        return -1;
        int x= number[i-1];
        int smallest = i;
        for(int j=i+1;j<number.length;j++)
        {
            if(number[j]>x && number[j]<=number[smallest])
               smallest=j;
        }
        char temp = number[i-1];
        number[i-1] = number[smallest];
        number[smallest]=temp;
        Arrays.sort(number,i,number.length);
        long ans = Long.parseLong(new String(number));
        if(ans>Integer.MAX_VALUE)
        return -1;
        else
        return (int)ans;
    }
}