package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 27..
 */
public class Chinese extends Person {
    @Override
    public void sayHello() {
        System.out.println("니하오");
    }

    @Override
    public void sayBye() {
        System.out.println("짜이찌엔");
    }
}
