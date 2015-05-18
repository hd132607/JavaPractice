package org.dimigo.basic;

/**
 * Created by Timo on 15. 3. 16..
 */
public class TypeCasting {
    public static void main(String argv[]) {
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;

        System.out.println(b+" "+s+" "+i+" "+l);

        long l1 = 100;
        int i1 = (int)l1;  // int i1  = li <오류!! 강제 (int)로 변환해야함>
        short s1 = (short)i1;  //short s1 = il <오류!! 강제 (short)로 변환해야함//
        byte b1 = (byte) s1;

        System.out.println(b1+" "+s1+" "+i1+" "+l1);

        //강제로 형 변환시 주의점
        int i2 = 128;
        byte b2 = (byte)i2;
        System.out.println(b2);  //제대로 나오지 X ex) -128

        long l2 = 10000000000L;
        int i3 =(int)12;
        System.out.println(i3);   //제대로 나오지 X

        ////////////////////////////////

    }
}
