package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.NotFoundException;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list =  departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		};
		
		System.out.println("\n=== TEST 4: department insert ===");
		Department newDepartment = new Department(null, "Eta");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 5: department update ===");
		department = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: department Delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		try {
			departmentDao.DeleteById(id);
			System.out.println("Delete completed!");
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
}
