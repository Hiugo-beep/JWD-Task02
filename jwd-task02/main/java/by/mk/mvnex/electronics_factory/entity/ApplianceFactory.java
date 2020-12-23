package by.mk.mvnex.electronics_factory.entity;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import by.mk.mvnex.electronics_factory.entity.criteria.*;
import by.mk.mvnex.electronics_factory.entity.criteria.SearchCriteria.*;

public class ApplianceFactory {
	private List<Appliance> appliance = null;
	
	public ApplianceFactory() {}
	public <List>Appliance create(String groupSearchName, Map<String, Object> criteria) {
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
					appliance.add(new Refrigerator(criteria);
					break;
				
				case "Speakers": 
					appliance.add(new Speakers(criteria);
					break;
				
				case "TabletPC": 
					appliance.add(new TabletPC(criteria);
					break;
				
				case "VacuumCleaner": 
					appliance.add(new VacuumCleaner(criteria);
					
				}
			}
		}
		return appliance;
	}
}
