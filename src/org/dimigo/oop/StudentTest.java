package org.dimigo.oop;

/**
 * Created by codertimo on 2015. 4. 17..
 * org.dimigo.oop
 * <p>
 * 1. 개요 :
 * 2. 작성일 : ${date}
 *
 * @version : 1.0
 * @auther : JunseongKim
 */
public class StudentTest {
    public static void main(String args[])
    {
        Student student1 = new Student(13,2,3,1);
        Student student2 = new Student(13,2,3,2,"박명수");
        Student student3 = new Student(13,2,3,3,"정준하","안산시");
        Student student4 = new Student(13,2,3,4,"정형돈","서울시","010-444-4444");
        student1.print();
        student2.print();
        student3.print();
        student4.print();
    }
}
