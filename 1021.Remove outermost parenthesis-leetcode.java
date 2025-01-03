class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int opencount=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                //Only add '(' if it's not the outermost
                if(opencount>0){
                    result.append(c);
                }
                opencount++;
            }
            
            else if(c==')'){
                opencount--;
                //Only add ')' if it's not the outermost
                if(opencount>0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
/*brute force*/
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int start = 0; // Start index of the current primitive
        int balance = 0; // To track the balance of parentheses

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }

            // When balance is 0, a primitive string is identified
            if (balance == 0) {
                // Remove outermost parentheses and append the rest
                result.append(s.substring(start + 1, i));
                start = i + 1; // Move start to the next character
            }
        }

        return result.toString();
    }
}
