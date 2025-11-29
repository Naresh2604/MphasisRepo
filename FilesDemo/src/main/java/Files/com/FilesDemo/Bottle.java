package Files.com.FilesDemo;

import java.io.Serializable;

public class Bottle implements Serializable{
	@Override

		// TODO Auto-generated method stub

		public String toString() {
		    return "Bottle(" +
		            "id=" + bottleid +
		            ", brand='" + brand + '\'' +
		            ", cost=" + cost +
		            ", colour='" + colour + '\'' +
		            ')';
		}

	
	public Bottle(int bottleid, String brand, double cost, String colour) {
		super();
		this.bottleid = bottleid;
		this.brand = brand;
		this.cost = cost;
		this.colour = colour;
	}
	public int getBottleid() {
		return bottleid;
	}
	public void setBottleid(int bottleid) {
		this.bottleid = bottleid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	private int bottleid;
	private String brand;
	private double cost;
	private String colour;

}
