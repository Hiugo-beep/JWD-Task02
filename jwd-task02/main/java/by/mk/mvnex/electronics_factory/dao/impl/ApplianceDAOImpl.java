package by.mk.mvnex.electronics_factory.dao.impl;
import java.util.HashMap;
import java.util.List;


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
