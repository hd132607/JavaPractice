package org.dimigo.beanutils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by codertimo on 2015. 11. 2..
 */
public class BeanUtilsManager {

    public static void mapToBean(Map properties, Object bean)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        if (properties == null)
            return;



    }

    public static void beanToMap(Object bean, Map properties)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Map map = PropertyUtils.describe(bean);
        properties.putAll(map);
        //describe 는 Object객체를 Map타입으로 만들어주는 함수이다.
    }
}
