import java.util.*;
class Solution{
    public int[] rotateElements(int[] arr,int k){
        List<Integer> al=new ArrayList<>();
           List<Integer> rol=new ArrayList<>();
        for(int n:arr)
        if(n>=0)
        al.add(n);         
        int temp=al.size();
        if(temp==0)return arr;
        k=((k%temp)+temp)%temp;     
        for(int i=k;i<temp;i++)
        rol.add(al.get(i));        
        for(int i=0;i<k;i++)rol.add(al.get(i));       

        int idx=0;
        for(int i=0;i<arr.length;i++)
        if(arr[i]>=0)
     arr[i]=rol.get(idx++);
            
        

        return arr;
    }
}