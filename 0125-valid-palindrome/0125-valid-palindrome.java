public class Solution {
    public boolean isPalindrome(String s) {
        String str = removeNonAlphanumeric(s);
        return isPalindrome(str, 0, str.length() - 1);
    }

    private String removeNonAlphanumeric(String s) {
        StringBuilder result = new StringBuilder();
        for (char character : s.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                result.append(Character.toLowerCase(character));
            }
        }
        return result.toString();
    }

    private boolean isPalindrome(String str, int left, int right) {
        if (left > right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }
}
