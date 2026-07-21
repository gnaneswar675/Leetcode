class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String st[]=startTime.split(":");
        String et[]=endTime.split(":");
        int res=0;
        int s=Integer.parseInt(et[2])-Integer.parseInt(st[2]);
        res+=s;
        int m=(Integer.parseInt(et[1])-Integer.parseInt(st[1]))*60;
        res+=m;
        int h=(Integer.parseInt(et[0])-Integer.parseInt(st[0]))*60*60;
        res+=h;
        return res;

    }
}