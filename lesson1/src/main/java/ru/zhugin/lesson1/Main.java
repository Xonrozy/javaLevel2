package ru.zhugin.lesson1;

import java.lang.reflect.Member;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Horny Pirates!");
        Course course = new Course(team);
        course.doIt();
        team.showResults();
    }
}
