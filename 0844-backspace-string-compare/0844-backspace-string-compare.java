class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i;
        char str1, str2;

        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();

        for (i = 0; i < s.length(); i++) {
            str1 = s.charAt(i);
            if (str1 != '#') {
                s1.append(str1);
            } else if (s1.length() > 0) {
                s1.deleteCharAt(s1.length() - 1);
            }
        }
        for (i = 0; i < t.length(); i++) {
            str2 = t.charAt(i);
            if (str2 != '#') {
                t1.append(str2);
            } else if (t1.length() > 0) {
                t1.deleteCharAt(t1.length() - 1);
            }
        }

        return s1.toString().equals(t1.toString());
    }
}