class Solution {
    public int myAtoi(String s) {
       int i=0, n=s.length(), sign=1;
       long result=0;
        //ignore leading white space
       while(i<n && s.charAt(i)==' '){
        i++;
       }
       //Handle optional sign
       if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
        sign=(s.charAt(i)=='-')? -1: 1;
        i++;
       }
       if(i<n && !Character.isDigit(s.charAt(i))){
        return 0;
       }
       //read digits and construct number
       while(i<n && Character.isDigit(s.charAt(i))){

        result = result * 10 + (s.charAt(i)-'0'); //main logic of this code
        //handle overflow/underflow
        if(result*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(result*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        i++;

       }

       return (int)(result*sign);

    }
}
