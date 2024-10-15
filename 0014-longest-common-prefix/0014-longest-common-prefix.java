class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int min = Integer.MAX_VALUE;
        String m = "";
        for (String s : strs) {
            if (s.length() < min) {
                min = s.length();
                m = s;
            }
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < m.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != m.charAt(i)) {
                    return sb.toString(); // Return early if characters don't match
                }
            }
            sb.append(m.charAt(i));
        }
        return sb.toString();
    }
}
