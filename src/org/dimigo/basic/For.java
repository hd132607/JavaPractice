package org.dimigo.basic;

/**
 * Created by Timo on 15. 3. 26..
 */
public class For  {
    public static void main(String args[]) {
        System.out.println("번호출력하기");
        for (int i = 1; i < 37; i++)
        {
            System.out.print(i + " ");
            if(i%10==0)
                System.out.println("");
        }

        System.out.println("");
        ///////////////////////////////////////////
        System.out.println("<<<<구구단 출력하기>>>");

        for(int i = 1;i<10;i++)
        {
            for(int j=1;j<10;j++)
                System.out.print(i+"x"+j+"="+(i*j)+" ");
            System.out.println("");
        }
        System.out.println("");
        ////////////////////////////////////////////
        int[] arr = {100,200,300};
        for(int i =0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println(" ");
        ////////////////////////////////////////////
        for(int value : arr)
            System.out.print(value);

        System.out.println(" ");
        ////////////////////////////////////////////

        String[] mudo = {"유재석","정형돈","박명수","하하","정준하","그녀석"};

        for(String val : mudo)
            System.out.print(val);

        ///////////////////////////////////////////
    }
}
