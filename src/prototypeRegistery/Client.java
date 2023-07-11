package prototypeRegistery;

public class Client {

    public static void main(String[] args) {
        Student stud23MayPro  = new Student();
        stud23MayPro.setBatch_name("May2023");
        stud23MayPro.setInstructor("Deepak");
        stud23MayPro.setModule("DSA");

        Student stud23JunePro = new Student();
        stud23JunePro.setBatch_name("June2023");
        stud23JunePro.setInstructor("Sai");
        stud23JunePro.setModule("Intermediate");

        StudentRegistery studentRegistery=new StudentRegistery();
        studentRegistery.register("May2023",stud23MayPro);
        studentRegistery.register("June2023",stud23JunePro);

        Student st1=studentRegistery.get("May2023").copy();
        st1.setNameOfStudent("vasavi");
        st1.setPhoneno("987654321");

        Student st2=studentRegistery.get("June2023").copy();
        st2.setNameOfStudent("Anjali");
        st2.setPhoneno("687554321");

        System.out.println(st1);
        System.out.println(st2);
    }
}
