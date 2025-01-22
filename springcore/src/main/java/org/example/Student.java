package org.example;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("Setting Student ID");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("Setting Student Name");
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("Setting Student Address");
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
        
       
    }
}



// 1. org.example
// 2. com.springcore.collections
// 3. com.springcore.ref
// 4. com.springcore.ci
// 5. com.springcore.lifecycle
// 6. com.springcore.auto.wire
// 7. com.springcore.auto.wire.annotation
// 8. com.springcore.standalone.collections
// 9. com.springcore.stereotype
// 10. com.springcore.spel
// 11. com.springcore.javaconfig