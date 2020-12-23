package by.mk.mvnex.electronics_factory.dao.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import by.mk.mvnex.electronics_factory.entity.criteria.Criteria;

public class ApplianceFilter {
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
