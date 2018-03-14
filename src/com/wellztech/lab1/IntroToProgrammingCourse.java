package com.wellztech.lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course{

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName,courseNumber);

    }

    public String getCourseNumber() {
        return super.getCourseNumber();
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        super.setCourseNumber(courseNumber);
    }

    public double getCredits() {

        return super.getCredits();
    }

    public String getCourseName() {

        return super.getCourseName();
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        super.setCourseName(courseName);
    }

    public void setCredits(double credits) {
        System.out.println("A"+credits);
        if (credits >= 0.5 && credits <= 4.0) {
            super.setCredits(credits);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }

    }

    
}
