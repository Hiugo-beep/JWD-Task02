package by.mk.mvnex.electronics_factory.service.impl;

import java.util.List;

import by.mk.mvnex.electronics_factory.dao.ApplianceDAO;
import by.mk.mvnex.electronics_factory.dao.DAOFactory;
import by.mk.mvnex.electronics_factory.entity.Appliance;
import by.mk.mvnex.electronics_factory.entity.criteria.Criteria;
import by.mk.mvnex.electronics_factory.service.ApplianceService;
import by.mk.mvnex.electronics_factory.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
