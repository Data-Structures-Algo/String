
public class Solution {

	public static boolean isPalindrome(String str) {
		int left = 0;
        int right = str.length() - 1;
		return isPalindromehelper(str,left,right);
		
	}
	private static boolean isPalindromehelper(String str,int left,int right){
		if(left>=right){
			return true;
		}
		if(str.charAt(left)!=str.charAt(right)){
			return false;
		}
		return isPalindromehelper(str,left+1,right-1);
	}

}
