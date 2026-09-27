class Solution {
    public String convertToTitle(int cnum) {
        StringBuilder result=new StringBuilder();
        while(cnum > 0){
             cnum--;
            int reminder=cnum % 26;
            char chr=(char)('A'+reminder);
            result.append(chr);
            cnum/=26;
           
        }

        return result.reverse().toString();
    }
}