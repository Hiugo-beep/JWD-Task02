package by.mk.mvnex.electronics_factory.entity;

public class VacuumCleaner extends Appliance{

	private int powerConsumption;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	private char filterType;
	private String bagType;
	private String wandType;
	
	public VacuumCleaner() {
		this.serialVersionUID = 1L;
	}
	public VacuumCleaner(int powerConsumption,int motorSpeedRegulation,int cleaningWidth, char filterType, String bagType, String  wandType) {
		this.serialVersionUID = 1L;
		this.powerConsumption = powerConsumption;
		this.cleaningWidth = cleaningWidth;
		this.filterType = filterType;
		this.bagType = bagType;
		this. wandType =  wandType;
	}
	public int getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}
	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}
	public int getCleaningWidth() {
		return cleaningWidth;
	}
	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}
	public char getFilterType() {
		return filterType;
	}
	public void setFilterType(char filterType) {
		this.filterType = filterType;
	}
	public String getBagType() {
		return bagType;
	}
	public void setBagType(String bagType) {
		this.bagType = bagType;
	}
	public String getWandType() {
		return wandType;
	}
	public void setWandType(String wandType) {
		this.wandType = wandType;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VacuumCleaner vacuumCleaner = (VacuumCleaner) obj;
		if (bagType == null) {
			if (vacuumCleaner.bagType != null)
				return false;
		} else if (!bagType.equals(vacuumCleaner.bagType))
			return false;
		if (cleaningWidth != vacuumCleaner.cleaningWidth)
			return false;
		if (filterType != vacuumCleaner.filterType)
			return false;
		if (motorSpeedRegulation != vacuumCleaner.motorSpeedRegulation)
			return false;
		if (powerConsumption != vacuumCleaner.powerConsumption)
			return false;
		if (wandType == null) {
			if (vacuumCleaner.wandType != null)
				return false;
		} else if (!wandType.equals(vacuumCleaner.wandType))
			return false;
		return true;
	}
	@Override
    public int hashCode() {
		return (int) (31 * powerConsumption + 31 * motorSpeedRegulation + 31 * cleaningWidth + 31 * (int)filterType
				+ ((null == bagType) ? 0 : bagType.hashCode()) + ((null == wandType) ? 0 : wandType.hashCode())); 
    }
	@Override
	public String toString() {
		return getClass().getName() + "@"
				+ "motorSpeedRegulation: " + motorSpeedRegulation
				+ ", cleaningWidth: " + cleaningWidth 
				+ ", filterType: " + filterType
				+ ", bagType: " + bagType
				+ ", wandType: " + wandType;
	}
	
}
