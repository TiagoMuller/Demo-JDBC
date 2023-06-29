package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department Insert ===");
		/*Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Insert done! Id: " + newDepartment.getId());*/
		
		System.out.println("\n=== TEST 2: department findByID ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: department Update ===");
		department = departmentDao.findById(8);
		department.setName("Cars");
		departmentDao.update(department);
		System.out.println("Update department!");
		System.out.println(departmentDao.findById(8));
		
		System.out.println("\n=== TEST 5: seller Delete ===");
		
	
	}
}