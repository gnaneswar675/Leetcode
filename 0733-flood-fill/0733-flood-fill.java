class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int num=image[sr][sc];
        if (num == color) return image;
        traverse(image,sr,sc,color,num);
        return image;
    }
    public void traverse(int[][] image, int sr, int sc, int color,int num){
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||image[sr][sc]!=num){
            return;
        }
        image[sr][sc]=color;
        traverse(image,sr+1,sc,color,num);
        traverse(image,sr-1,sc,color,num);
        traverse(image,sr,sc+1,color,num);
        traverse(image,sr,sc-1,color,num);
    }
}