package model.dao;

import java.util.List;

import model.dao.impl.NotFoundException;
import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void DeleteById(Integer id) throws NotFoundException;
	Department findById(Integer id);
	List<Department> findAll();
}