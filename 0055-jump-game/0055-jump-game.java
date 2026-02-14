class Solution {
    public boolean canJump(int[] A) {
  int r = 0;
  for (int i = 0; i < A.length; i++)
    if (i <= r) r = Math.max(r, i + A[i]);
  return r >= A.length - 1;
}

}