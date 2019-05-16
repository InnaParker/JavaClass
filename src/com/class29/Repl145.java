package com.class29;

class EncapsulationDemo4 {
	
	private long acc_no;  
	private String name, email;  
	private float amount;
	
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}  
}
public class Repl145 {

	public static void main(String[] args) {
		EncapsulationDemo4 obj=new EncapsulationDemo4();
		obj.setAcc_no(7560504000l);
		obj.setName("Sumair");
		obj.setEmail("sumair@syntaxsolutions.com");
		obj.setAmount(500000.0f);
				
		System.out.println(obj.getAcc_no()+" "+obj.getName()+" "+obj.getEmail()+" "+obj.getAmount());
	}

}
