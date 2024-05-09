package com.bishwa;

public class Electric {

	private int cid;
	private String cname;
	private double creading;
	private double preding;
	public Electric() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCreading() {
		return creading;
	}
	public void setCreading(double creading) {
		this.creading = creading;
	}
	public double getPreding() {
		return preding;
	}
	public void setPreding(double preding) {
		this.preding = preding;
	}
	
	public void printElectricityBill()
	{
		System.out.println("++++++++++++++++print Custormer Bill +++++++++++++++++++++");
		System.out.println("Customer id : ="+getCid());
		System.out.println("Customer Name: ="+ getCname());
		System.out.println("Customer CReading : ="+ getCreading());
		System.out.println("Customer PReading : ="+ getPreding());
		
		
		double unit=creading-preding;
		if(unit<300) {
			double total=unit*1.75;
			System.out.println("total :"+ total);
			 
		}
		else if(unit>=300) {
			double total=unit*7.45;
			System.out.println("Total :"+total);
		}
		else {
			double total=unit*9.23;
			System.out.println("Unit :"+unit);
			System.out.println("Total :"+ total);
		}
	}

}
