class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curmass=mass;
        for(int num:asteroids){
            if(curmass>=num){
                curmass+=num;
            }else{
                return false;
            }
        }return true;
    }
}