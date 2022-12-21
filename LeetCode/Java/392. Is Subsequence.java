class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl = s.length();
        if(s.length() < 1)
            return true;

        int sc = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(sc) == t.charAt(i)){
                sc += 1;
                if(sc >= sl)
                    return true;
            }
        }

        return false;
    }
}

