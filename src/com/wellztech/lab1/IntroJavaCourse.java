package com.wellztech.lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */

public class IntroJavaCourse extends Course {

    String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
        setPrerequisites(prerequisites);
    }

    public String getCourseNumber() {
        return super.getCourseNumber();
    }

    public void setCourseNumber(String courseNumber) {

        super.setCourseNumber(courseNumber);
    }

    public double getCredits() {

        return super.getCredits();
    }


    public String getPrerequisites() {

        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {

        this.prerequisites = prerequisites;
    }


}
