package org.dimigo.beanutils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by codertimo on 2015. 11. 2..
 */
public class BeanUtilsTest {

    public static Map map = null;
    public static Student student = null;

    public static void main(String  args[])
    {
        //사용할 객체들 소환

        //Class객체
        student = new Student(2601,"Hong-Gil",2,6,1);

        //Map 객체
        map = new HashMap<>();
        map.put("id",2607);
        map.put("name", "Junseong");
        map.put("grade",2);
        map.put("class_number", 6);
        map.put("number",1);


        try {
            //Object to Map 구현
            Map test = new HashMap<>();
//            BeanUtilsManager.beanToMap(student, test);

            System.out.println(test.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try{
            //Map to Object 구현
            Object test = new Object();

            //populate 는 Map객체를 Object타입으로 전환시켜주는 함수이다
            BeanUtils.populate(map, (Map<String, ? extends Object>) test);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }





    }

}
