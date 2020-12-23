package by.mk.mvnex.electronics_factory.entity;

public class Speakers extends Appliance{
	private int powerConsumption;
	private int numberOfSpeakers;
	private int cordLength;
	private String frequencyRange;
	public Speakers() {
		this.serialVersionUID = 1L;
	}
	public Speakers(int powerConsumption,int numberOfSpeakers,int cordLength,String frequencyRange) {
		this.serialVersionUID = 1L;
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.cordLength = cordLength;
		this.frequencyRange= frequencyRange;
	}
	public int getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}
	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}
	public int getCordLength() {
		return cordLength;
	}
	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}
	public String getFrequencyRange() {
		return frequencyRange;
	}
	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers speakers = (Speakers) obj;
		if (cordLength != speakers.cordLength)
			return false;
		if (frequencyRange == null) {
			if (speakers.frequencyRange != null)
				return false;
		} else if (!frequencyRange.equals(speakers.frequencyRange))
			return false;
		if (numberOfSpeakers != speakers.numberOfSpeakers)
			return false;
		if (powerConsumption != speakers.powerConsumption)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		return (int) (31 * powerConsumption + 31 * powerConsumption + 31 * numberOfSpeakers + 31 * cordLength
				+ ((null == frequencyRange) ? 0 : frequencyRange.hashCode()));
	}
	
	@Override
	public String toString() {
		return getClass().getName() + "@" 
				+ "powerConsumption=" + powerConsumption 
				+ ", numberOfSpeakers=" + numberOfSpeakers 
				+ ", cordLength=" + cordLength
				+ ", frequencyRange="  + frequencyRange;
	}
	
}
