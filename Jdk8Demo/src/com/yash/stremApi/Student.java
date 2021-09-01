package com.yash.stremApi;
import java.time.LocalDate;
import java.time.Month;
public class Student 
{
	int rollno;
	String name;
	String div;
	int score;
	LocalDate dob;
	public Student()
	{
		super();
	}
	public Student(int rollno, String name, String div, int score,LocalDate dob) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.div = div;
		this.score = score;
		this.dob = dob;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", div=" + div + ", score=" + score + ", dob=" + dob
				+ "]";
	}
}
	
