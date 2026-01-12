package com.example.javatestpractice;

import lombok.Getter;

@Getter
public class Study {

    private StudyStatus studyStatus = StudyStatus.DRAFT;

    private int limit;


}
