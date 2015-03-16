package org.dimigo.basic;

/**
 * Created by Timo on 15. 3. 13..
 */
public class PrimitiveDataType {

    public static void main(String argv[])
    {
        String name = "아이유";
        boolean gender = false;
        int age = 23;
        double heigh = 161.8;
        float weight = 44.3f;
        String blood_type = "A";

        System.out.println("이름: " + name);
        if(gender)
            System.out.println("성별: " + "남자");
        else
            System.out.println("성별: " + "여자");
        System.out.println("나이: " + age);
        System.out.println("키: " + heigh);
        System.out.println("몸무게: " + weight);
        System.out.println("혈액형: " + blood_type);

    }

}
