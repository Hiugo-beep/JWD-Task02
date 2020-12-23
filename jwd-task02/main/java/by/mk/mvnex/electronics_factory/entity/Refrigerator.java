package by.mk.mvnex.electronics_factory.entity;

public class Refrigerator extends Appliance{
	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private double overallCapacity;
	private double height;
	private double widtch;
	public Refrigerator() {
		this.serialVersionUID = 1L;
	}
	public Refrigerator(int powerConsumption,int weight,int freezerCapacity, double overallCapacity, double height, double widtch) {
		this.serialVersionUID = 1L;
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.widtch = widtch;
	}
	public int getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getFreezerCapacity() {
		return freezerCapacity;
	}
	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}
	public double getOverallCapacity() {
		return overallCapacity;
	}
	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidtch() {
		return widtch;
	}
	public void setWidtch(double widtch) {
		this.widtch = widtch;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator refrigerator = (Refrigerator) obj;
		if (freezerCapacity != refrigerator.freezerCapacity)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(refrigerator.height))
			return false;
		if (Double.doubleToLongBits(overallCapacity) != Double.doubleToLongBits(refrigerator.overallCapacity))
			return false;
		if (powerConsumption != refrigerator.powerConsumption)
			return false;
		if (weight != refrigerator.weight)
			return false;
		if (Double.doubleToLongBits(widtch) != Double.doubleToLongBits(refrigerator.widtch))
			return false;
		return true;
	}	
	
	@Override
	public int hashCode() {
		return (int) (31 * powerConsumption + 31 * weight + 31 * freezerCapacity + 31 * overallCapacity
				+ 31 * height + 31 * widtch);
	}
	
	@Override
	public String toString() {
		return getClass().getName() + "@" 
				+ "powerConsumption=" + powerConsumption 
				+ ", weight=" + weight 
				+ ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" 
				+ overallCapacity + ", height=" 
				+ height + ", widtch=" 
				+ widtch;
	}
	
	
}
