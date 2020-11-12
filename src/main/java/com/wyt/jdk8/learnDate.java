package com.wyt.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class learnDate {
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}
