package by.mk.mvnex.electronics_factory.service;

import java.util.List;

import by.mk.mvnex.electronics_factory.entity.Appliance;
import by.mk.mvnex.electronics_factory.entity.criteria.Criteria;


public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria);
	
}
