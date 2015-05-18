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
public class Student {
    private int gisu;
    private int grade;
    private int ban;
    private int number;
    private String name;
    private String address;
    private String phone;

    public Student(int gisu, int grade, int ban, int number, String name, String address, String phone)
    {
        this.gisu = gisu;
        this.grade = grade;
        this.ban = ban;
        this.number = number;
        this.name =name;
        this.address = address;
        this.phone = phone;
    }
    public Student(int gisu, int grade, int ban, int number, String name, String address)
    {
        this(gisu,grade,ban,number,name,address,"번호없음");
    }
    public Student(int gisu, int grade, int ban, int number, String name)
    {
        this(gisu,grade,ban,number,name,"주소없음","번호없음");
    }
    public Student(int gisu, int grade, int ban, int number)
    {
        this(gisu,grade,ban,number,"이름없음","주소없음","번호없음");
    }
    public void print()
    {
        this.Loging("<<학생정보출력>>");
        this.Loging("1. 학번: "+getHackBon());
        this.Loging("2. 이름: "+this.name);
        this.Loging("3. 주소: "+this.address);
        this.Loging("4. 휴대폰 번호: " + this.phone);
    }
    private void Loging(String string)
    {
        System.out.println(string);
    }
    private String getHackBon()
    {
        return ""+this.gisu+this.grade+String.format("%02d",this.number);
    }
}
