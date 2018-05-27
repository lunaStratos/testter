package com.testter.myapp.vo;

public class loginVO {

	String id;
	String pw;

	public loginVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public loginVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "loginVO [id=" + id + ", pw=" + pw + "]";
	}

}
