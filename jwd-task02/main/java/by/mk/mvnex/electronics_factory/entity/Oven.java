package by.mk.mvnex.electronics_factory.entity;

public class Oven extends Appliance{
	private int powerConsumption;
	private int weight;
	private int capacity;
	private int depth;
	private double height;
	private double widtch;
	public Oven() {
		this.serialVersionUID = 1L;
	}
	public Oven(int powerConsumption,int weight,int capacity, int depth, double height, double widtch) {
		this.serialVersionUID = 1L;
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
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
		if(obj == this) {
			return true;
		}
		if (obj == null ) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Oven oven = (Oven) obj;
		if(powerConsumption != oven.powerConsumption ) {
			return false;
		}
		if(weight!=oven.weight ) {
			return false;
		}
		if(capacity!= oven.capacity ) {
			return false;
		}
		if(depth!= oven.depth ) {
			return false;
		}
		if(height != oven.height) {
			return false;
		}	
		if(widtch != oven.widtch) {
			return false;
		}	
		return true;
	}
	@Override
    public int hashCode() {
		return (int) (31 * powerConsumption + 31 * weight + 31 * capacity + 31 * depth
				+ 31 * height + 31 * widtch);
    }
	@Override
	public String toString() {
		return getClass().getName() + "@"
				+ "powerConsumption: " + powerConsumption
				+ ", weight: " + weight 
				+ ", capacity: " + capacity
				+ ", depth: " + depth
				+ ", height: " + height
				+ ", widtch: " + widtch;
	}
}
