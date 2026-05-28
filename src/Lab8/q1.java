package Lab8;

public class q1 {
    public static void ForLoopSearch(int[]a,int x){
        for(int i=0;i<a.length;i++){
           if(a[i]==x){
               System.out.println("found at "+a[i]);
           }
           else {
               System.out.print("");
           }
        }
    }

    public static void main(String[]args){
        int[]b = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < b.length; i++) {
            int x = i;
            ForLoopSearch (b, x);
        }
    }
}
