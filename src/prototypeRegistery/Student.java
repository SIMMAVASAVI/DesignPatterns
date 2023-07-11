package prototypeRegistery;

public class Student {

    private String batch_name;
    private String instructor;
    private String module;
    private String nameOfStudent;
    private String phoneno;

    public Student copy(){
        Student st=new Student();
        st.batch_name=this.batch_name;
        st.instructor=this.instructor;
        st.module=this.module;
        st.nameOfStudent=this.module;
        st.phoneno=this.phoneno;
        return st;
    }

    public Student(){

    }

    public Student(String batch_name, String instructor, String module, String nameOfStudent, String phoneno) {
        this.batch_name = batch_name;
        this.instructor = instructor;
        this.module = module;
        this.nameOfStudent = nameOfStudent;
        this.phoneno = phoneno;
    }

    public String getBatch_name() {
        return batch_name;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getModule() {
        return module;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "batch_name='" + batch_name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", module='" + module + '\'' +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                ", phoneno='" + phoneno + '\'' +
                '}';
    }
}
