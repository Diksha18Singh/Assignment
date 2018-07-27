package com.UsingThread;

public class Contact {
	
	private  String fn;
	private  String ln;
	private  int age ;
	private  long phone;
	private  String email;
	public Contact(String fn, String ln, int age, long phone, String email) {
		super();
		this.fn = fn;
		this.ln = ln;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [fn=" + fn + ", ln=" + ln + ", age=" + age + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
	

}
