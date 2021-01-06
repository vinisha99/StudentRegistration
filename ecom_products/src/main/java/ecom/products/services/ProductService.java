package ecom.products.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ecom.products.models.Product;

@Service
public class ProductService {
	public List<Product> getAllProducts(){
		ArrayList<Product> products = new ArrayList<>();
		
		products.add(new Product("1", "Phone", "Used for Communication", 1000, "Apple"));
		products.add(new Product("2", "Earphones", "For Audio", 200, "Airpods"));
		products.add(new Product("3", "Charger", "For Charging", 100, "Samsung"));
		
		return products;
	}

}
