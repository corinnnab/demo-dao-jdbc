package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("---- TEST 1: department findById----");
		Department dep = depDao.findById(1);
		System.out.println(dep);

		System.out.println("\n---- TEST 3: seller findAll----");
		List<Department> departments = depDao.findAll();
		for (Department obj : departments) {
			System.out.println(obj);
		}
	}

}
