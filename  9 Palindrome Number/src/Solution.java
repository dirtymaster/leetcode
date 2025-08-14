class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        char[] charArray = String.valueOf(x).toCharArray();
        for (int i = 0; i < charArray.length / 2; ++i) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}