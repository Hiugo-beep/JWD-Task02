package by.mk.mvnex.electronics_factory.entity;

public class Laptop extends Appliance {
	private double batteryCapacity;
	private double cpu;
	private double displayInchs;
	private int memoryRom;
	private int systemMemory;
	private String os;
	public Laptop() {
		this.serialVersionUID = 1L;
	}
	public Laptop(double batteryCapacity, double cpu, double displayInchs,int memoryRom, int systemMemory,String os) {
		this.serialVersionUID = 1L;
		this.batteryCapacity = batteryCapacity;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.os = os;
	}
	
	public double getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(double batteryCapacity){
		this.batteryCapacity = batteryCapacity;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu){
		this.cpu = cpu;
	}
	public double getDisplayInchs() {
		return displayInchs;
	}
	public void setDisplayInchs(double displayInchs){
		this.displayInchs = displayInchs;
	}
	public int getMemoryRom() {
		return memoryRom;
	}
	public void setMemoryRom(int memoryRom){
		this.memoryRom = memoryRom;
	}
	public int getSystemMemory() {
		return systemMemory;
	}
	public void setSystemMemory(int systemMemory){
		this.systemMemory = systemMemory;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os){
		this.os = os;
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
		Laptop laptop = (Laptop) obj;
		if(batteryCapacity != laptop.batteryCapacity ) {
			return false;
		}
		if(cpu!=laptop.cpu ) {
			return false;
		}
		if(displayInchs!= laptop.displayInchs ) {
			return false;
		}
		if(memoryRom!= laptop.memoryRom ) {
			return false;
		}
		if(systemMemory != laptop.systemMemory ) {
			return false;
		}
		if(null == os ) {
			return (os == laptop.os );
		} else {
			if(!os.equals(laptop.os )) {
				return false;
			}
		}		
		return true;
	}
	@Override
    public int hashCode() {
		return (int) (31 * batteryCapacity + 31 * cpu + 31 * displayInchs + 31 * memoryRom 
				+ 31 * systemMemory + ((null == os) ? 0 : os.hashCode())); 
    }
	@Override
	public String toString() {
		return getClass().getName() + "@"
				+ "batteryCapacity: " + batteryCapacity 
				+ ", cpu: " + cpu 
				+ ", displayInchs: " + displayInchs 
				+ ", memoryRom: " + memoryRom 
				+ ", systemMemory: " + systemMemory 
				+ ", os: " + os;
	}
}
