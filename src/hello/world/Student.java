/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 *Modified on Jan 17th at 2.28pm by Jaskiran
 * Modified for third commit
 * @author JasKiran Kaur Sidhu
 */
public class Student {
    private int sID;
    private String sName;

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
public class Student {
public static void main(String[] args){
    Student s1 = new Student(1, "Ronak");
    Student[] studentList = new Student[3];
    
    studentList[0] = s1;
    studentList[1] = new Student(2, "Sheth");
    studentList[2] = new Student(2, "abc");
    
    for(int i = 0; i<studnetList.length; i++)
    {
        System.out.println(StudentList[i].getsName());
    }
        

}
}
