class Solution {
    public int romanToInt(String s) {
        char[] a = s.toCharArray();
        int result = 0;
        for (int i = 0; i < a.length; ++i) {
            int next = i != a.length - 1 ? a[i + 1] : '-';
            switch (a[i]) {
                case 'V':
                    result += 5;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                case 'I':
                    if (next == 'V') {
                        result += 4;
                        ++i;
                    } else if (next == 'X') {
                        result += 9;
                        ++i;
                    } else {
                        ++result;
                    }
                    break;
                case 'X':
                    if (next == 'L') {
                        result += 40;
                        ++i;
                    } else if (next == 'C') {
                        result += 90;
                        ++i;
                    } else {
                        result += 10;
                    }
                    break;
                case 'C':
                    if (next == 'D') {
                        result += 400;
                        ++i;
                    } else if (next == 'M') {
                        result += 900;
                        ++i;
                    } else {
                        result += 100;
                    }
                    break;
            }
        }
        return result;
    }
}
