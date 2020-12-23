package by.mk.mvnex.electronics_factory.service.validation;


import java.util.Map;


import by.mk.mvnex.electronics_factory.entity.criteria.Criteria;
import by.mk.mvnex.electronics_factory.entity.criteria.SearchCriteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		// you may add your own code here
		if(criteria.getCriteria().isEmpty()) return false;
		boolean isEmptyType = criteria.getGroupSearchName() == null || criteria.getGroupSearchName() == "";
		if(!isEmptyType) {
			Map<String, Object> map = criteria.getCriteria();
			Object[] parametrs = map.keySet().toArray();
			int sizeParametrs = parametrs.length;
 			switch(criteria.getGroupSearchName()) {
			case "Oven": 
				for(int i=0;i<sizeParametrs;i++) {
						if(!SearchCriteria.Oven.values().equals(parametrs[i])) {
							return false;
						}
						
				}
				break;	
			case "Laptop": 
				for(int i=0;i<sizeParametrs;i++) {
						if(!SearchCriteria.Laptop.values().equals(parametrs[i])) {
							return false;
						}
						
				}
				break;	
			case "Refrigerator": 
				for(int i=0;i<sizeParametrs;i++) {
						if(!SearchCriteria.Refrigerator.values().equals(parametrs[i])) {
							return false;
						}
						
				}
				break;	
			case "Speakers": 
				for(int i=0;i<sizeParametrs;i++) {
						if(!SearchCriteria.Speakers.values().equals(parametrs[i])) {
							return false;
						}
						
				}
				break;	
			case "TabletPC": 
				for(int i=0;i<sizeParametrs;i++) {
						if(!SearchCriteria.TabletPC.values().equals(parametrs[i])) {
							return false;
						}
						
				}
				break;	
			case "VacuumCleaner": 
				for(int i=0;i<sizeParametrs;i++) {
						if(!SearchCriteria.VacuumCleaner.values().equals(parametrs[i])) {
							return false;
						}
						
				}
			}
		}
		return true;

	}

}