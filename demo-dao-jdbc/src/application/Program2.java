package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao department = DaoFactory.createDepartmentDao();
		Department dp = new Department(6, "Souveniers");
		department.insert(dp);
		
		System.out.println("\n=== TESTE 1: department insert ===");
		System.out.println("INSERTED ID: " + dp.getId());
		
		System.out.println("\n=== TESTE 2: department delete ===");
		department.deleteById(5);
		
		System.out.println("\n=== TESTE 3: department findById ===");
		department.findById(3);
	}

}
