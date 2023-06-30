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
		System.out.print("Add department? (s/n) :");
		char rep = sc.next().charAt(0);
		if(rep == 's') {
			System.out.print("Enter a name for the new Department: ");
			Department newDepartment = new Department(null, sc.next());
			departmentDao.insert(newDepartment);
			System.out.println("Insert done! Id: " + newDepartment.getId() + "| Name: " + newDepartment.getName());
		}
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: department findByID ===");
		System.out.print("Enter id for test Department FindById: ");
		Department department = departmentDao.findById(sc.nextInt());
		System.out.println(department);
	
		System.out.println("\n=== TEST 4: department Update ===");
		System.out.print("Add department? (s/n) :");
		char rep2 = sc.next().charAt(0);
		if(rep2 == 's') {
			System.out.print("Enter id for test Department Update: ");
			Department dep2 = departmentDao.findById(sc.nextInt());
			System.out.print("Enter name for test to Department Update: ");
			dep2.setName(sc.next());
			departmentDao.update(dep2);
			System.out.println("Update department!");
			System.out.println(dep2);
		}
		
		System.out.println("\n=== TEST 5: seller Delete ===");
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.print("Enter id for delete department test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Remove completed!");
	
	}
}
