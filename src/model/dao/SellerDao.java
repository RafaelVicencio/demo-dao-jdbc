package model.dao;

import java.util.List;

import model.dao.impl.NotFoundException;
import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void DeleteById(Integer id) throws NotFoundException;
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}