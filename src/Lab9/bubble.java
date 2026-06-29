package Lab9;

import static Lab9.random.nodup_array;

public class bubble {
    //ใส่ค้า n แล้วให้เรียงตามภาพ

    public static void bubble_shot(int n){
        int[][]allNumber = new int[n][n];
        int count=1,temp=0,checkJ=0;

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                allNumber[i][j]=count;
                //เงื่อนไขแสดงจำนวนก่อนถึง -1
                if(j == n-2-i ){
                    temp = count;
                    count=-2;
                }else if((j == n-1-i)||(count==0)){
                    count = -1;
                }
                //เงื่อนไขให้เก็บค่า
                if(j==n-1){count=temp;}

                //การทำให้เก็บค่าเป็น -1 และ 0
                if(i==n-2&& j==n-1){count = -2;
                } else if(i==n-1){count = -1;}
                count++;
                System.out.print(allNumber[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        bubble_shot(10);
    }



}
