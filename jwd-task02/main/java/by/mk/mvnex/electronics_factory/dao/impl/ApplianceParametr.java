package by.mk.mvnex.electronics_factory.dao.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ApplianceParametr {
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