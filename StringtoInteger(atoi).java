public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if ("".equals(str)) return 0;
        double result = 0;
        boolean positive = true;
        if (str.charAt(0) == '-') positive = false;
        else if (str.charAt(0) == '+' || Character.isDigit(str.charAt(0))) {
            positive = true;
        } else return 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && i > 0) break;
            if (Character.isDigit(str.charAt(i))) {
                result = result * 10 + (str.charAt(i) - '0');
            }
        }
        result = positive ? result : -result;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) result;
    }
}