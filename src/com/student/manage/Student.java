package com.student.manage;

public class Student{
	private int studentID;
    private String studentName;
    private String studentEmail;
    private String studentPhone;
    private String studentCity;

    public Student(){
        super();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }


    public Student(int studentID, String studentName, String studentEmail, String studentPhone, String studentCity) {
        super();
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student(String studentName,String studentEmail,String studentPhone,String studentCity) {
        super();
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student(String studentName, String studentEmail, String studentPhone, String studentCity,int studentID) {
        super();
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "student[" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ']';
    }

}
