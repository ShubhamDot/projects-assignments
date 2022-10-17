class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        if(n < 26)
            return false;

        int[] check = new int[26];
        for(int i = 0; i< n; i++){
            check[sentence.charAt(i) - 'a']++;
        }

        for(int i = 0; i< check.length; i++){
            if(check[i] == 0){
                return false;
            }
        }
