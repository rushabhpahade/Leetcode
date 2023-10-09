# Program to reverse an Interger in Python
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x>0:       
            string = (str(x)[::-1])  
            n = int(string)
            if n>2**31:
                return 0
            else: return n
        else:
            x= x*-1
            string = (str(x)[::-1])
            n = int(string)
            if n>2**31:
                return 0
            else: return n*-1        
        