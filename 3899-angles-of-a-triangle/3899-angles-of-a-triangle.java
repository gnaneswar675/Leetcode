class Solution {
    public double[] internalAngles(int[] arr) {
        int a=arr[0],b=arr[1],c=arr[2];
        if(a+b<=c || b+c<=a || a+c<=b)
            return new double[]{};
            

        double x=Math.toDegrees(Math.acos(
            (b*b+c*c-a*a)/(2.0*b*c)
        ));
        double y=Math.toDegrees(Math.acos(
            (a*a+c*c-b*b)/(2.0*a*c)
        ));
        double z=180.0-y-x;
        double res[]={x,y,z};Arrays.sort(res);return res;
    }
}