package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department Insert ===");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Insert done!");
		
		System.out.println("\n=== TEST 2: seller findAll ===");
		
		
		System.out.println("\n=== TEST 3: seller findByID ===");
		
		
		System.out.println("\n=== TEST 4: seller Update ===");
	
		
		System.out.println("\n=== TEST 5: seller Delete ===");
		
	
	}
}
