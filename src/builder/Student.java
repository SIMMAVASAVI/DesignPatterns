package builder;

import builder.exceptions.InavalidIdException;
import builder.exceptions.InvalidMobileNoException;
import builder.exceptions.InvalidNameException;

import java.util.Map;
import java.util.Stack;

public class Student {

        private String name;
        private int rollNo;
        private int mobileNo;

        private Student(Builder builder) {
                this.name = builder.name;
                this.rollNo = builder.rollNo;
                this.mobileNo =builder.mobileNo;
        }

        public static Builder builder(){
                Builder b= new Builder();
                return b;
        }

        static class Builder {

                String name;
                int rollNo;
                int mobileNo;

                public Builder setName(String name) {
                        this.name = name;
                        return this;
                }

                public Builder setRollNo(int rollNo) {
                        this.rollNo = rollNo;
                        return this;
                }

                public Builder setMobileNo(int mobileNo) {
                        this.mobileNo = mobileNo;
                        return this;
                }

                public void Validate(){
                        if( name==null){
                                throw new InvalidNameException("Name should not be null");
                        }
                        if( rollNo<0){
                                throw new InavalidIdException("roll no should not be less than 0");
                        }
                        if(mobileNo==0){
                                throw new InvalidMobileNoException("Mobile number should not be null");
                        }
                }

                public Student build(){
                        this.Validate();
                        return new Student(this);
                }

        }

}
