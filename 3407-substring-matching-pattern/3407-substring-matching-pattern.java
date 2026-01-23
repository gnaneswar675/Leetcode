class Solution {
    public boolean hasMatch(String s, String p) {

        int star = 0;
        while (p.charAt(star) != '*') {
            star++;
        }

        String left = p.substring(0, star);
        String right = p.substring(star + 1);

        int start = s.indexOf(left);
        if (start == -1) return false;

        int end = s.indexOf(right, start + left.length());
        return end != -1;
    }
}
