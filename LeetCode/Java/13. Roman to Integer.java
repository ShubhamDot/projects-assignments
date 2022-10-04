class Solution {
    public int romanToInt(String s) {
        int out=0;
    int i;
    for (i =1; i< s.length(); i++){
        if (value(s.charAt(i-1))<value(s.charAt(i))){
            out -= value(s.charAt(i-1));
        }else
            out += value(s.charAt(i-1));
    }
    out += value(s.charAt(i-1));
    return out;
    }
    int value(char r)
{
    if (r == 'I')
        return 1;
    if (r == 'V')
        return 5;
    if (r == 'X')
        return 10;
    if (r == 'L')
        return 50;
    if (r == 'C')
        return 100;
    if (r == 'D')
        return 500;
    if (r == 'M')
        return 1000;
    return -1;
}
}
