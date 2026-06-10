package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(2, "Books");
		System.out.println(dp);
		
		Seller seller = new Seller(5, "Mateus", "mateus@gmail.com", new Date(), 3000.0, dp);
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		

	}

}
