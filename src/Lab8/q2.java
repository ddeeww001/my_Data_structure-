package Lab8;

public class q2 {
    public static void BinarySearch(int[]a,int x){
        int len = a.length;
        BinarySearch_recur(a,x,0,len-1);
    }

    public static void BinarySearch_recur(int[]a , int x, int left , int right){
        int mid = left+((right-left+1)/2);

        if((left==right)||left>right){
            return;
        }
        if(a[mid]==x){
            System.out.println("found at "+mid);
            return;
        }
        if(a[mid]>x){
            BinarySearch_recur(a,x,left,mid-1);
        }else if(a[mid]<x){
            BinarySearch_recur(a,x,mid,right);
        }
    }

    public static void main(String[]args){
        int[]b = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < b.length; i++) {
            int x = i;
            BinarySearch(b, x);
        }
    }

}
/*
q3 bid O log n
q4 big O n
q5
 */