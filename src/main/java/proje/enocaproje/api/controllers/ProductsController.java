package proje.enocaproje.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proje.enocaproje.business.abstracts.ProductService;
import proje.enocaproje.core.utulities.result.DataResult;
import proje.enocaproje.core.utulities.result.Result;
import proje.enocaproje.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		
		this.productService = productService;
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		
		
		return productService.add(product);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Product product) {
		
		
		return productService.add(product);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Product>> getAll() {
		
		return this.productService.getAll(); 
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Product product) {
		
		return this.productService.update(product);
	}
	
	 

}
