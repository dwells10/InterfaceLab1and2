package com.wellztech.lab1;

import javax.swing.*;

public abstract class Course {

    String courseName;
    private String courseNumber;
    private double credits;

    public Course(String courseName, String courseNumber){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCourseName() {
        return courseName;
    }


    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseNumber(){
        return courseNumber;
    }


    public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits >= 0.1 && credits <= 6.0) {
            this.credits = credits;
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.1 to 6.0");
            System.exit(0);
        }
    }


}
