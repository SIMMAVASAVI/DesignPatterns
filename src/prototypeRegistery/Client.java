package prototypeRegistery;

public class Client {

    public static void main(String[] args) {
        Student stud23MayPro  = new Student();
        stud23MayPro.setBatch_name("May2023");
        stud23MayPro.setInstructor("Deepak");
        stud23MayPro.setModule("DSA");


        Student st1=stud23MayPro.copy();
        st1.setNameOfStudent("vasavi");
        st1.setPhoneno("987654321");

        Student st2=stud23MayPro.copy();
        st2.setNameOfStudent("Anjali");
        st2.setPhoneno("687554321");

        System.out.println(st1);
        System.out.println(st2);
    }
}
