class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = arr.length - 1, mx = -1; i >= 0; --i)
            mx = Math.max(arr[i], arr[i] = mx);
        return arr;
    }
}
