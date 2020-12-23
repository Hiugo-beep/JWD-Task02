package by.mk.mvnex.electronics_factory.dao;

import java.util.List;

import by.mk.mvnex.electronics_factory.entity.Appliance;
import by.mk.mvnex.electronics_factory.entity.criteria.Criteria;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);
}
