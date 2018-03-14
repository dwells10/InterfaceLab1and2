package com.wellztech.lab2;

import com.wellztech.lab1.AdvancedJavaCourse;
import com.wellztech.lab1.Course;
import com.wellztech.lab1.IntroJavaCourse;
import com.wellztech.lab1.IntroToProgrammingCourse;

public class StartUp {

    public static void main(String[] args) {

        Course ajc = new AdvancedJavaCourse("Data Structures","201" );
        Course ijc = new IntroJavaCourse("JavaBasics","102");
        Course ipc = new IntroToProgrammingCourse("Intro to Programming","101");

        ipc.setCredits(2.5);

    }

}
