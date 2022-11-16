public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0;
        int max = n;
        while(l < n){
            int mid = l + (max - l)/2;
            if(guess(mid) == 0){
                return mid;
            }
            else if(guess(mid) == -1){
                max = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return n;
    }
}
