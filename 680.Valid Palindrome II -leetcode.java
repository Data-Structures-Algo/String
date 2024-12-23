class Solution {
    public boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){ //if not palindrome 
                //skip one 
                return ispalindrome(s,left+1,right)|| ispalindrome(s,left,right-1);
            }
            left++;
            right--;
        }  
        return true; //already is a palindrome
    }
    private boolean ispalindrome(String s,int left,int right){

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
