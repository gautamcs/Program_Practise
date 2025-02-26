package com.gautam.model;

public class Student {
    private int stuId;
    private String studentName;
    private String course;

    public Student(int stuId, String studentName, String course) {
        this.stuId = stuId;
        this.studentName = studentName;
        this.course = course;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", studentName='" + studentName + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
