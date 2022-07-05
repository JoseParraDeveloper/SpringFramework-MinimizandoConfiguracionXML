package com.joseparradev.model;

public abstract class Vehicle {

	private String nameCompany;
	private String mailCompany;
	private String functionVehicleCompany;
	private String color;

	protected Vehicle() {
		super();

	}

	protected Vehicle(String nameCompany, String mailCompany, String functionVehicleCompany, String color) {
		super();
		this.nameCompany = nameCompany;
		this.mailCompany = mailCompany;
		this.functionVehicleCompany = functionVehicleCompany;
		this.color = color;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getMailCompany() {
		return mailCompany;
	}

	public void setMailCompany(String mailCompany) {
		this.mailCompany = mailCompany;
	}

	public String getFunctionVehicleCompany() {
		return functionVehicleCompany;
	}

	public void setFunctionVehicleCompany(String functionVehicleCompany) {
		this.functionVehicleCompany = functionVehicleCompany;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract String getCharacteristicsVehicle();

}
