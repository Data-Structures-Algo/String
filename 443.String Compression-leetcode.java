class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int count= 1;
        int index = 0;

        for(int i=1;i<chars.length;i++){
            if(chars[i-1]!=chars[i]){
                chars[index++] = chars[i-1];

                if(count>1){
                char[]c = String.valueOf(count).toCharArray();
                for(char ch:c) chars[index++] = ch;
                }
                count = 1;
            }
            else{
                count++;
            }
        }
        chars[index++] = chars[chars.length-1];
        if (count > 1) {
            char[] c = String.valueOf(count).toCharArray();
            for (char ch : c) chars[index++] = ch;
        }
        return index;
    }
}
