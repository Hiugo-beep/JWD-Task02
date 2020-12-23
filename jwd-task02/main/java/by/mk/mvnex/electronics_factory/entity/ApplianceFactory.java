package by.mk.mvnex.electronics_factory.entity;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import by.mk.mvnex.electronics_factory.entity.criteria.*;
import by.mk.mvnex.electronics_factory.entity.criteria.SearchCriteria.*;

public class ApplianceFactory {
	private List<Appliance> appliance = null;
	
	public ApplianceFactory() {}
	public List<Appliance> create(String groupSearchName, Map<String, Object> criteria) {
		Iterator iterator = appliance.iterator();
		while(iterator.hasNext()) {
			if(groupSearchName!="" && groupSearchName!= null) {
			switch(groupSearchName) {
				case "Oven": 
					appliance.add(new Oven((int)criteria.get( SearchCriteria.Oven.POWER_CONSUMPTION.toString()),
							(int)criteria.get(SearchCriteria.Oven.WEIGHT.toString()),
							(int)criteria.get(SearchCriteria.Oven.CAPACITY.toString()),
							(int)criteria.get(SearchCriteria.Oven.DEPTH.toString()),
							(double)criteria.get(SearchCriteria.Oven.HEIGHT.toString()),
							(double)criteria.get(SearchCriteria.Oven.WIDTH.toString())
							));
					break;
			
				case "Laptop": 
					appliance.add(new Laptop((double)criteria.get( SearchCriteria.Laptop.BATTERY_CAPACITY.toString()),
							(double)criteria.get(SearchCriteria.Laptop.CPU.toString()),
							(double)criteria.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString()),
							(int)criteria.get(SearchCriteria.Laptop.MEMORY_ROM.toString()),
							(int)criteria.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()),
							(String)criteria.get(SearchCriteria.Laptop.OS.toString())
							));
					break;
					
				case "Refrigerator": 
					appliance.add(new Refrigerator((int)criteria.get( SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()),
							(int)criteria.get(SearchCriteria.Refrigerator.WEIGHT.toString()),
							(int)criteria.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()),
							(double)criteria.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()),
							(double)criteria.get(SearchCriteria.Refrigerator.HEIGHT.toString()),
							(double)criteria.get(SearchCriteria.Refrigerator.WIDTH.toString())
							));
					break;
				
				case "Speakers": 
					appliance.add(new Speakers((int)criteria.get( SearchCriteria.Speakers.POWER_CONSUMPTION.toString()),
							(int)criteria.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()),
							(int)criteria.get(SearchCriteria.Speakers.CORD_LENGTH.toString()),
							(String)criteria.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())
							));
					break;
				
				case "TabletPC": 
					appliance.add(new TabletPC((int)criteria.get( SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()),
							(int)criteria.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()),
							(int)criteria.get(SearchCriteria.TabletPC.MEMORY_ROM.toString()),
							(int)criteria.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()),
							(String)criteria.get(SearchCriteria.TabletPC.COLOR.toString())
							));
					break;
				case "VacuumCleaner": 
					appliance.add(new VacuumCleaner ((int)criteria.get( SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()),
							(int)criteria.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()),
							(int)criteria.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()),
							(char)criteria.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()),
							(String)criteria.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()),
							(String)criteria.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())
							));
				}
			}
		}
		return appliance;
	}
}
