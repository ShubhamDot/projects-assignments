class Solution {
    public String breakPalindrome(String palindrome) {

        int l = palindrome.length();
        if(l <= 1){
            return "";
        }
        
        
        for(int i = 0; i < l/2; i++){
            if(palindrome.charAt(i) != 'a' ){
                palindrome = palindrome.substring(0 , i) + "a" + palindrome.substring(i+1);
                return palindrome;
            } 
        }

        palindrome = palindrome.substring(0, l-1) + "b";
        return palindrome;
    }
}
