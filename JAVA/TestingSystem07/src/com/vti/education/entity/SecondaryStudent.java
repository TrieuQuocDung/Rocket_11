package com.vti.education.entity;

public class SecondaryStudent extends Student{
public static int counterSecondary = 0;
	
	public SecondaryStudent(String name) throws Exception {
        super(name);
        counterSecondary ++;
    }
}
