/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JasKiran Kaur Sidhu
 */
public class PartTimeStudent extends Student {
    
    private int numOfCourses;

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }

    public PartTimeStudent(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    
}
