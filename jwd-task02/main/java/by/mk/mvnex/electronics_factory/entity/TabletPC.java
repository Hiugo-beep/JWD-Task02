package by.mk.mvnex.electronics_factory.entity;

public class TabletPC extends Appliance{
	private int batteryCapacity;
	private int displayInches;
	private int flashMemoryCapacity;
	private int memoryRom;
	private String color;
	public TabletPC() {
		this.serialVersionUID = 1L;
	}
	public TabletPC(int batteryCapacity, int displayInchs,int memoryRom, int flashMemoryCapacity,String color) {
		this.serialVersionUID = 1L;
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getDisplayInches() {
		return displayInches;
	}
	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}
	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}
	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}
	public int getMemoryRom() {
		return memoryRom;
	}
	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabletPC tabletPC = (TabletPC) obj;
		if (batteryCapacity != tabletPC.batteryCapacity)
			return false;
		if (color == null) {
			if (tabletPC.color != null)
				return false;
		} else if (!color.equals(tabletPC.color))
			return false;
		if (displayInches != tabletPC.displayInches)
			return false;
		if (flashMemoryCapacity != tabletPC.flashMemoryCapacity)
			return false;
		if (memoryRom != tabletPC.memoryRom)
			return false;
		return true;
	}
	@Override
    public int hashCode() {
		return (int) (31 * batteryCapacity + 31 * displayInches + 31 * flashMemoryCapacity + 31 * memoryRom 
				+ ((null == color) ? 0 : color.hashCode())); 
    }
	@Override
	public String toString() {
		return getClass().getName() + "@"
				+ "batteryCapacity: " + batteryCapacity 
				+ ", displayInches: " + displayInches 
				+ ", memoryRom: " + memoryRom 
				+ ", flashMemoryCapacity: " + flashMemoryCapacity
				+ ", color: " + color;
	}
	
}
