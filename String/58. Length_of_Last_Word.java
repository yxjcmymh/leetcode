class Solution { // usage of trim()
    public int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
} // memory use: 39.4 MB (14.27%), runtime: 0 ms (100%)

class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null);

        int len = 0;
        s = s.trim();
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == ' ') break;
            len ++;
        }

        return len;
    }
} // memory use: 37.4 MB (87.95%), runtime: 0 ms (100%)
