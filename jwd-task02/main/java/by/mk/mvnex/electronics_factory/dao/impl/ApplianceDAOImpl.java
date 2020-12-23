package by.mk.mvnex.electronics_factory.dao.impl;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import by.mk.mvnex.electronics_factory.dao.ApplianceDAO;
import by.mk.mvnex.electronics_factory.entity.Appliance;
import by.mk.mvnex.electronics_factory.entity.ApplianceFactory;
import by.mk.mvnex.electronics_factory.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public List<Appliance> find(Criteria criteria) {
		
		ApplianceReader applianceReader = new ApplianceReader();
		List<String> applianceData = applianceReader.takeAll();
		
		ApplianceFilter applianceFilter = new ApplianceFilter(applianceData);
		List<String> filtredApplianceData = applianceFilter.filter(criteria);
		
		ApplianceParametr applianceParametr = new ApplianceParametr(filtredApplianceData);
		HashMap<String, Object> mapParametrs = applianceParametr.getMapParametr();
		
		ApplianceFactory applianceFactory = new ApplianceFactory();
		List<Appliance> appliances = applianceFactory.create(criteria.getGroupSearchName(), mapParametrs);
		
		return appliances;

	}

}



class ApplianceReader implements ApplianceCommonReader {
	private List<String> file;
	
	public List<String> takeAll(){
		readApplianceFile();
		return file;
	}

	@Override
	public void readApplianceFile() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("resources/appliances_db.txt"));
			Iterator<String> iterator = file.iterator();
			file.add(reader.readLine());
			while(iterator.hasNext()) {
				file.add(reader.readLine());
	    	}
	     	reader.close();
		}	catch(Exception e) {
		file = null;
		}
	}
}

class ApplianceFilter{
	private List<String>applianceData;
	private List<String> applianceFiltredData;
	public ApplianceFilter() {}
	public ApplianceFilter(List<String> applianceData) {
		this.applianceData = applianceData;
	}
	
	public List<String> filter(Criteria criteria){
		Iterator<String> iterator = applianceData.iterator();
		if(criteria.getGroupSearchName()!=null && criteria.getGroupSearchName()!="") {
			for(int i=0;i<applianceData.size();i++) {
				if(iterator.next().contentEquals(criteria.getGroupSearchName())) {
					applianceFiltredData.add(iterator.next());
				}
				iterator.hasNext();
			}
			
		} else {
			applianceFiltredData = applianceData;
		}
		
		Map<String, Object> map = criteria.getCriteria();
		String[] parametrs = (String[])map.keySet().toArray();
				
		for(int i =0;i < criteria.getCriteria().size();i++) {
			Iterator<String> iteratorFiltred = applianceFiltredData.iterator();
			if(!iteratorFiltred.next().contentEquals(parametrs[i])) {
				iteratorFiltred.remove();
			}
			else {
				if(!iteratorFiltred.next().contentEquals((String)map.get(parametrs[i]))) {
					iteratorFiltred.remove();
				}
			}
			iterator.hasNext();
		}
		return applianceData;
	}
}

class ApplianceParametr{
	private List<String> filtredApplianceData;
	private HashMap<String, Object> mapParametrs = null;
	public ApplianceParametr() {}
	public ApplianceParametr(List<String> filtredApplianceData) {
		this.filtredApplianceData = filtredApplianceData;
	}
	public HashMap<String, Object> getMapParametr(){
		if(filtredApplianceData.size()>0){
			List<String> names = null;
			List<String> values = null;
			String[] parametrs = null;
			String[] finalParametrs = null;
			Iterator<String> iterator = filtredApplianceData.iterator();
			do {
				String delimeter = " "; // Разделитель
				String parametr[] = iterator.next().split(delimeter);
			
				for(int i=0;i<parametr.length;i++) {
					String delimeter2 = "="; // Разделитель
					parametrs = parametr[i].split(delimeter2);
				}
				
				for(int i=1;i<parametr.length;i+=2) {
					String delimeter3 = ","; // Разделитель
					finalParametrs = parametrs[i].split(delimeter3);
				}
			} while(iterator.hasNext());
			for(int i=0;i<parametrs.length;i+=2) {
				names.add(parametrs[i]);
			}
			Iterator<String> iteratorNames = names.iterator();
			Iterator<String> iteratorValues = values.iterator();
			for(int i=0;i<finalParametrs.length;i++) {
				values.add(finalParametrs[i]);
				mapParametrs.put(iteratorNames.next(), iteratorValues.next());
				iteratorNames.hasNext();
				iteratorValues.hasNext();
			}
		}
		return mapParametrs;
	}
	
}