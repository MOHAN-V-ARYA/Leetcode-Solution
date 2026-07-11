class Solution {
    public boolean isPalindrome(String s) {
        int i,j;
        String s1=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        //^ works as not logic gate 
        // u got logic but improve efficiency broo!!!!!
       // i=0;
        //j=s1.length()-1;
    
        for(i=0,j=s1.length()-1;i<j;i++,j--){
            if(s1.charAt(i)!=s1.charAt(j))
            return false;
        }

     return true;   
    }
}