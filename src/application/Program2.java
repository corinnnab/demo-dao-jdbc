package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("---- TEST 1: department findById----");
		Department dep = depDao.findById(1);
		System.out.println(dep);

		System.out.println("\n---- TEST 2: department findAll----");
		List<Department> departments = depDao.findAll();
		for (Department obj : departments) {
			System.out.println(obj);
		}
		
		System.out.println("\n---- TEST 3: department insert----");
		Department newDep= new Department(null, "Fashion");
		depDao.insert(newDep);
		System.out.println("New id = " + newDep.getId());
		
		System.out.println("\n---- TEST 4: department update----");
		dep = depDao.findById(1);
		dep.setName("Used items");
		depDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("\n---- TEST 5: department delete----");
		System.out.println("Enter id for delete test: ");
		Integer id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed.");
	}

}
