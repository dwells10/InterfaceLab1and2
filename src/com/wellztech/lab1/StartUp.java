package com.wellztech.lab1;

public class StartUp {

    public static void main(String[] args) {

        Course ajc = new AdvancedJavaCourse("Data Structures","201" );
        Course ijc = new IntroJavaCourse("JavaBasics","102");
        Course ipc = new IntroToProgrammingCourse("Intro to Programming","101");

        ipc.setCredits(3.3);

    }

}
