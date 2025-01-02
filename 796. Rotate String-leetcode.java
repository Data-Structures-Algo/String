class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String concatenated = s + s;
        //Check if goal is a substring of s + s
        return concatenated.contains(goal);
    }
}
