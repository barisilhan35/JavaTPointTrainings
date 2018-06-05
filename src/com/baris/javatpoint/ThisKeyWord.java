package com.baris.javatpoint;

class Studentin{
    int rollno;
    String name,course,gender;
    float fee;
    Studentin(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Studentin(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
    Studentin(int rollno,String name,String course, String gender)  {
        this(rollno,name,course);
        this.gender=gender;

    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee+" "+gender);}
}
class ThisKeyWord{
    public static void main(String args[]){
        Studentin s1=new Studentin(111,"ankit","java");
        Studentin s2=new Studentin(112,"sumit","java",6000f);
        Studentin s3 =new Studentin(113,"gg","java","g");
        s1.display();
        s2.display();
        s3.display();
    }}
