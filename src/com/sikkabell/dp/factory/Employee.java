package com.sikkabell.dp.factory;

public class Employee {

	private Integer id;
	private String name;
	private Long mobileno;
	private String msgType;
	
	
	
	public Employee() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String name, Long mobileno, String msgType) {
		//super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
		this.msgType = msgType;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", msgType=" + msgType + "]";
	}

	
}
