package com.basicJava.class15;

public class StudentScores {
	public static void main(String[] args) {
		 Student student = new Student();
		 student.setRollNo(1);
		 student.setName("Shyam Dahal");
		 student.setAddress("Baneshwor 1");
		 
		 Score score = new Score(student, 3.55);
		 score.showStudentInfo();
	}

}
